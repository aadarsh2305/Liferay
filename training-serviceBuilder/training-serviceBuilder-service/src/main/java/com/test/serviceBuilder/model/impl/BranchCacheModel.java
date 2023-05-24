/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.serviceBuilder.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.test.serviceBuilder.model.Branch;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Branch in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BranchCacheModel implements CacheModel<Branch>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BranchCacheModel)) {
			return false;
		}

		BranchCacheModel branchCacheModel = (BranchCacheModel)object;

		if (Id == branchCacheModel.Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", Id=");
		sb.append(Id);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", City=");
		sb.append(City);
		sb.append(", address1=");
		sb.append(address1);
		sb.append(", address2=");
		sb.append(address2);
		sb.append(", Country=");
		sb.append(Country);
		sb.append(", State=");
		sb.append(State);
		sb.append(", Pincode=");
		sb.append(Pincode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Branch toEntityModel() {
		BranchImpl branchImpl = new BranchImpl();

		if (uuid == null) {
			branchImpl.setUuid("");
		}
		else {
			branchImpl.setUuid(uuid);
		}

		branchImpl.setGroupId(groupId);
		branchImpl.setCompanyId(companyId);
		branchImpl.setUserId(userId);

		if (userName == null) {
			branchImpl.setUserName("");
		}
		else {
			branchImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			branchImpl.setCreateDate(null);
		}
		else {
			branchImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			branchImpl.setModifiedDate(null);
		}
		else {
			branchImpl.setModifiedDate(new Date(modifiedDate));
		}

		branchImpl.setId(Id);

		if (Name == null) {
			branchImpl.setName("");
		}
		else {
			branchImpl.setName(Name);
		}

		branchImpl.setCity(City);

		if (address1 == null) {
			branchImpl.setAddress1("");
		}
		else {
			branchImpl.setAddress1(address1);
		}

		if (address2 == null) {
			branchImpl.setAddress2("");
		}
		else {
			branchImpl.setAddress2(address2);
		}

		branchImpl.setCountry(Country);
		branchImpl.setState(State);
		branchImpl.setPincode(Pincode);

		branchImpl.resetOriginalValues();

		return branchImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		Id = objectInput.readLong();
		Name = objectInput.readUTF();

		City = objectInput.readLong();
		address1 = objectInput.readUTF();
		address2 = objectInput.readUTF();

		Country = objectInput.readLong();

		State = objectInput.readLong();

		Pincode = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(Id);

		if (Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Name);
		}

		objectOutput.writeLong(City);

		if (address1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address1);
		}

		if (address2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address2);
		}

		objectOutput.writeLong(Country);

		objectOutput.writeLong(State);

		objectOutput.writeInt(Pincode);
	}

	public String uuid;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long Id;
	public String Name;
	public long City;
	public String address1;
	public String address2;
	public long Country;
	public long State;
	public int Pincode;

}