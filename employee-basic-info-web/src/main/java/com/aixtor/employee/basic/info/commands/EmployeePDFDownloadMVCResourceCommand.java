package com.aixtor.employee.basic.info.commands;

import com.aixtor.employee.basic.info.constants.EmployeePortletKeys;
import com.aixtor.employee.basic.info.constants.ExportDataConstants;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.test.serviceBuilder.model.Employee;
import com.test.serviceBuilder.service.EmployeeLocalService;

import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { 
		"javax.portlet.name="+EmployeePortletKeys.EMPLOYEE_PORTLET,
		"mvc.command.name=exportPDF", 
		}, 
service = MVCResourceCommand.class)
public class EmployeePDFDownloadMVCResourceCommand extends BaseMVCResourceCommand {

	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		
		log.info(" >>> EmployeePDFDownloadMVCResourceCommand >>> doServeResource :::::");
		// Setting content type for PDF file
	    resourceResponse.setContentType("application/pdf");
	    
	    // Setting header type for PDF file
	    resourceResponse.setProperty("Content-Disposition", "attachment; filename=employee_details.pdf");
	    Document document = null;
	    PdfWriter pdfWriter = null;
		try {
			//Getting all Employees from ServiceBuilder
		    List<Employee> employeeList=employeeLocalService.getEmployees(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		    
		    
		    for (Employee employee : employeeList) {
		    	
			}
		    document=new Document();
		    pdfWriter=PdfWriter.getInstance(document, resourceResponse.getPortletOutputStream());
		    
		    //Adding MetaData
		    document.addAuthor("Aadarsh");
		    document.addTitle("Employee Details");
		    document.open();
		    
		    Paragraph header=new Paragraph("Employee Details");
		    document.add(header);
		    
		    // Add header row
		    String[] tableHeader= {ExportDataConstants.EMPLOYEE_ID, ExportDataConstants.EMPLOYEE_NAME,
					ExportDataConstants.EMPLOYEE_MOBILE_NO, ExportDataConstants.EMPLOYEE_EMAIL,
					ExportDataConstants.DESIGNATION_ID, ExportDataConstants.DEPARTMENT_ID,
					ExportDataConstants.BRANCH_ID };		

		    int columnLength=tableHeader.length;
		    //Add table with employee data
		    PdfPTable table = new PdfPTable(columnLength);
		    
		    
		    
		    PdfPCell cell ;
		    for (int i = 0; i < tableHeader.length; i++) {
		    	cell = new PdfPCell(new Phrase(tableHeader[i]));
		    	table.addCell(cell);
			}
		    
		    
		    // Add data rows
	        for (Employee employee : employeeList) {
	            table.addCell(String.valueOf(employee.getId()));
	            table.addCell(employee.getName());
//	            long mobileNo=employee.getMobileNo();
//	            String mobileNoString=Long.toString(mobileNo);
	            table.addCell(String.valueOf(employee.getMobileNo()));
	            table.addCell(employee.getEmail());
//	            long designationId=employee.getDesignationId();
//	            String desigantionIdString=Long.toString(designationId);
	            table.addCell(String.valueOf(employee.getDesignationId()));
//	            long departmentId=employee.getDepartmentId();
//	            String departmentIdString=Long.toString(departmentId);
	            table.addCell(String.valueOf(employee.getDepartmentId()));
//	            long branchId=employee.getBranchId();
//	            String branchIdString=Long.toString(branchId);
	            table.addCell(String.valueOf(employee.getBranchId()));
	            
	        }
	        document.add(table);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			document.close();
			pdfWriter.close();	
		}
	    
   
	}

	private static final Log log = LogFactoryUtil.getLog(EmployeePDFDownloadMVCResourceCommand.class);
	@Reference
	private EmployeeLocalService employeeLocalService;

}
