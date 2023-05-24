create table Service_Builder_Branch (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	Id LONG not null primary key,
	Name VARCHAR(75) null,
	City LONG,
	address1 VARCHAR(75) null,
	address2 VARCHAR(75) null,
	Country LONG,
	State LONG,
	Pincode INTEGER
);



create table Service_Builder_City (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	cityId LONG not null primary key,
	cityName VARCHAR(75) null,
	stateId LONG
);

create table Service_Builder_Department (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	Id LONG not null primary key,
	Name VARCHAR(75) null,
	Head VARCHAR(75) null
);

create table Service_Builder_Designation (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	Id LONG not null primary key,
	Name VARCHAR(75) null
);


create table Service_Builder_Employee (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	Id LONG not null primary key,
	Name VARCHAR(75) null,
	MobileNo LONG,
	Email VARCHAR(75) null,
	departmentId LONG,
	branchId LONG,
	designationId LONG
);

create table Service_Builder_SpringMvc (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	id_ LONG not null primary key,
	firstName VARCHAR(75) null
);

create table Service_Builder_State (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	stateId LONG not null primary key,
	stateName VARCHAR(75) null,
	countryId LONG
);