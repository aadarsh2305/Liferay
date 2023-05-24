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

package com.test.serviceBuilder.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Branch}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Branch
 * @generated
 */
public class BranchWrapper
	extends BaseModelWrapper<Branch> implements Branch, ModelWrapper<Branch> {

	public BranchWrapper(Branch branch) {
		super(branch);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("Id", getId());
		attributes.put("Name", getName());
		attributes.put("City", getCity());
		attributes.put("address1", getAddress1());
		attributes.put("address2", getAddress2());
		attributes.put("Country", getCountry());
		attributes.put("State", getState());
		attributes.put("Pincode", getPincode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		Long City = (Long)attributes.get("City");

		if (City != null) {
			setCity(City);
		}

		String address1 = (String)attributes.get("address1");

		if (address1 != null) {
			setAddress1(address1);
		}

		String address2 = (String)attributes.get("address2");

		if (address2 != null) {
			setAddress2(address2);
		}

		Long Country = (Long)attributes.get("Country");

		if (Country != null) {
			setCountry(Country);
		}

		Long State = (Long)attributes.get("State");

		if (State != null) {
			setState(State);
		}

		Integer Pincode = (Integer)attributes.get("Pincode");

		if (Pincode != null) {
			setPincode(Pincode);
		}
	}

	@Override
	public Branch cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address1 of this branch.
	 *
	 * @return the address1 of this branch
	 */
	@Override
	public String getAddress1() {
		return model.getAddress1();
	}

	/**
	 * Returns the address2 of this branch.
	 *
	 * @return the address2 of this branch
	 */
	@Override
	public String getAddress2() {
		return model.getAddress2();
	}

	/**
	 * Returns the city of this branch.
	 *
	 * @return the city of this branch
	 */
	@Override
	public long getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this branch.
	 *
	 * @return the company ID of this branch
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the country of this branch.
	 *
	 * @return the country of this branch
	 */
	@Override
	public long getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this branch.
	 *
	 * @return the create date of this branch
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this branch.
	 *
	 * @return the group ID of this branch
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this branch.
	 *
	 * @return the ID of this branch
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the modified date of this branch.
	 *
	 * @return the modified date of this branch
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this branch.
	 *
	 * @return the name of this branch
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the pincode of this branch.
	 *
	 * @return the pincode of this branch
	 */
	@Override
	public int getPincode() {
		return model.getPincode();
	}

	/**
	 * Returns the primary key of this branch.
	 *
	 * @return the primary key of this branch
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the state of this branch.
	 *
	 * @return the state of this branch
	 */
	@Override
	public long getState() {
		return model.getState();
	}

	/**
	 * Returns the user ID of this branch.
	 *
	 * @return the user ID of this branch
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this branch.
	 *
	 * @return the user name of this branch
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this branch.
	 *
	 * @return the user uuid of this branch
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this branch.
	 *
	 * @return the uuid of this branch
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address1 of this branch.
	 *
	 * @param address1 the address1 of this branch
	 */
	@Override
	public void setAddress1(String address1) {
		model.setAddress1(address1);
	}

	/**
	 * Sets the address2 of this branch.
	 *
	 * @param address2 the address2 of this branch
	 */
	@Override
	public void setAddress2(String address2) {
		model.setAddress2(address2);
	}

	/**
	 * Sets the city of this branch.
	 *
	 * @param City the city of this branch
	 */
	@Override
	public void setCity(long City) {
		model.setCity(City);
	}

	/**
	 * Sets the company ID of this branch.
	 *
	 * @param companyId the company ID of this branch
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the country of this branch.
	 *
	 * @param Country the country of this branch
	 */
	@Override
	public void setCountry(long Country) {
		model.setCountry(Country);
	}

	/**
	 * Sets the create date of this branch.
	 *
	 * @param createDate the create date of this branch
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this branch.
	 *
	 * @param groupId the group ID of this branch
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this branch.
	 *
	 * @param Id the ID of this branch
	 */
	@Override
	public void setId(long Id) {
		model.setId(Id);
	}

	/**
	 * Sets the modified date of this branch.
	 *
	 * @param modifiedDate the modified date of this branch
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this branch.
	 *
	 * @param Name the name of this branch
	 */
	@Override
	public void setName(String Name) {
		model.setName(Name);
	}

	/**
	 * Sets the pincode of this branch.
	 *
	 * @param Pincode the pincode of this branch
	 */
	@Override
	public void setPincode(int Pincode) {
		model.setPincode(Pincode);
	}

	/**
	 * Sets the primary key of this branch.
	 *
	 * @param primaryKey the primary key of this branch
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the state of this branch.
	 *
	 * @param State the state of this branch
	 */
	@Override
	public void setState(long State) {
		model.setState(State);
	}

	/**
	 * Sets the user ID of this branch.
	 *
	 * @param userId the user ID of this branch
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this branch.
	 *
	 * @param userName the user name of this branch
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this branch.
	 *
	 * @param userUuid the user uuid of this branch
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this branch.
	 *
	 * @param uuid the uuid of this branch
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected BranchWrapper wrap(Branch branch) {
		return new BranchWrapper(branch);
	}

}