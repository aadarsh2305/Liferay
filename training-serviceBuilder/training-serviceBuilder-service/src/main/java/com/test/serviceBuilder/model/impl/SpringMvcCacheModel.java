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

import com.test.serviceBuilder.model.SpringMvc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SpringMvc in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SpringMvcCacheModel
	implements CacheModel<SpringMvc>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SpringMvcCacheModel)) {
			return false;
		}

		SpringMvcCacheModel springMvcCacheModel = (SpringMvcCacheModel)object;

		if (id == springMvcCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

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
		sb.append(", id=");
		sb.append(id);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SpringMvc toEntityModel() {
		SpringMvcImpl springMvcImpl = new SpringMvcImpl();

		if (uuid == null) {
			springMvcImpl.setUuid("");
		}
		else {
			springMvcImpl.setUuid(uuid);
		}

		springMvcImpl.setGroupId(groupId);
		springMvcImpl.setCompanyId(companyId);
		springMvcImpl.setUserId(userId);

		if (userName == null) {
			springMvcImpl.setUserName("");
		}
		else {
			springMvcImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			springMvcImpl.setCreateDate(null);
		}
		else {
			springMvcImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			springMvcImpl.setModifiedDate(null);
		}
		else {
			springMvcImpl.setModifiedDate(new Date(modifiedDate));
		}

		springMvcImpl.setId(id);

		if (firstName == null) {
			springMvcImpl.setFirstName("");
		}
		else {
			springMvcImpl.setFirstName(firstName);
		}

		springMvcImpl.resetOriginalValues();

		return springMvcImpl;
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

		id = objectInput.readLong();
		firstName = objectInput.readUTF();
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

		objectOutput.writeLong(id);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}
	}

	public String uuid;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long id;
	public String firstName;

}