create index IX_78E94394 on DESIGNATION_Designation (Name[$COLUMN_LENGTH:75$]);
create index IX_7435A229 on DESIGNATION_Designation (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1BE29EEB on DESIGNATION_Designation (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_FBC0B584 on Service_Builder_Branch (Name[$COLUMN_LENGTH:75$], Id);
create index IX_CF8FB22A on Service_Builder_Branch (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_72D2BB2C on Service_Builder_Branch (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_656F809 on Service_Builder_City (cityName[$COLUMN_LENGTH:75$]);
create index IX_84B21DDD on Service_Builder_City (stateId);
create index IX_825062F3 on Service_Builder_City (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_AA6B0A35 on Service_Builder_City (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_371123C5 on Service_Builder_Department (Name[$COLUMN_LENGTH:75$]);
create index IX_7CA1C0DA on Service_Builder_Department (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3178B5DC on Service_Builder_Department (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BF0368E on Service_Builder_Designation (Name[$COLUMN_LENGTH:75$]);
create index IX_7655EE23 on Service_Builder_Designation (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B7B9A165 on Service_Builder_Designation (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CDBE26A1 on Service_Builder_Employee (Name[$COLUMN_LENGTH:75$]);
create index IX_9FDAAD54 on Service_Builder_Employee (branchId, departmentId);
create index IX_5FD6383 on Service_Builder_Employee (departmentId);
create index IX_767559B6 on Service_Builder_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D1D4D5B8 on Service_Builder_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6D15F239 on Service_Builder_SpringMvc (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_35B7B2FB on Service_Builder_SpringMvc (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_13955D98 on Service_Builder_State (countryId);
create index IX_A9105E43 on Service_Builder_State (stateName[$COLUMN_LENGTH:75$]);
create index IX_AAC27F3D on Service_Builder_State (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_506BB0FF on Service_Builder_State (uuid_[$COLUMN_LENGTH:75$], groupId);