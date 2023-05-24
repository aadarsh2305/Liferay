package com.aixtor.employee.basic.info.bean;

public class EmployeeBean {
	
	private long id;
	private String name;
	long mobileNumber  ;
	String email;
	String department;
	String designtion;
	String branch;
	long departmentId;
	long designationId;
	long branchId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesigntion() {
		return designtion;
	}
	public void setDesigntion(String designtion) {
		this.designtion = designtion;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(long designationId) {
		this.designationId = designationId;
	}
	public long getBranchId() {
		return branchId;
	}
	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}
	public EmployeeBean(long id, String name, long mobileNumber, String email, String department, String designtion,
			String branch, long departmentId, long designationId, long branchId) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.department = department;
		this.designtion = designtion;
		this.branch = branch;
		this.departmentId = departmentId;
		this.designationId = designationId;
		this.branchId = branchId;
	}
	public EmployeeBean() {
		super();
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", department=" + department + ", designtion=" + designtion + ", branch=" + branch + ", departmentId="
				+ departmentId + ", designationId=" + designationId + ", branchId=" + branchId + "]";
	}

}
