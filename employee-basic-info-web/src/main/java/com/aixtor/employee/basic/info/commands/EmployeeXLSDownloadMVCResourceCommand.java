package com.aixtor.employee.basic.info.commands;

import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.aixtor.employee.basic.info.constants.ExportDataConstants;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.test.serviceBuilder.model.Employee;
import com.test.serviceBuilder.service.EmployeeLocalService;

import java.io.OutputStream;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { 
		"javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE_PORTLET,
		"mvc.command.name=exportExcelXLS", 
		}, 
service = MVCResourceCommand.class)
public class EmployeeXLSDownloadMVCResourceCommand extends BaseMVCResourceCommand {

	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		log.info(" >>> EmployeeXLSDownloadMVCResourceCommand >>> inside doServeResource >>> :::::");

		// Setting content type and header for Excel file
		resourceResponse.setContentType("application/vnd.ms-excel");

		resourceResponse.setProperty("Content-Disposition", "attachment; filename=employee_details.xls");

		OutputStream outputStream = null;
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmployeeData");
		
			List<Employee> employeeList = employeeLocalService.getEmployees(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			// Create header row
			HSSFRow headerRow = sheet.createRow(0);
			String[] headerArray = { ExportDataConstants.EMPLOYEE_ID, ExportDataConstants.EMPLOYEE_NAME,
					ExportDataConstants.EMPLOYEE_MOBILE_NO, ExportDataConstants.EMPLOYEE_EMAIL,
					ExportDataConstants.DESIGNATION_ID, ExportDataConstants.DEPARTMENT_ID,
					ExportDataConstants.BRANCH_ID };
			
			for (int i = 0; i < headerArray.length; i++) {
				headerRow.createCell(i).setCellValue(headerArray[i]);
			}

			int rowIndex = 1;
			for (Employee getEmployee : employeeList) {

				// Creating data rows
				HSSFRow row = sheet.createRow(rowIndex++);
				row.createCell(0).setCellValue(getEmployee.getId());
				row.createCell(1).setCellValue(getEmployee.getName());
				row.createCell(2).setCellValue(getEmployee.getMobileNo());
				row.createCell(3).setCellValue(getEmployee.getEmail());
				row.createCell(4).setCellValue(getEmployee.getDesignationId());
				row.createCell(5).setCellValue(getEmployee.getDepartmentId());
				row.createCell(6).setCellValue(getEmployee.getBranchId());

			}

			outputStream = resourceResponse.getPortletOutputStream();
			workbook.write(outputStream);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			outputStream.flush();
		}

	}

	private static final Log log = LogFactoryUtil.getLog(EmployeeXLSDownloadMVCResourceCommand.class);
	@Reference
	private EmployeeLocalService employeeLocalService;
}
