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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the SpringMvc service. Represents a row in the &quot;Service_Builder_SpringMvc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.test.serviceBuilder.model.impl.SpringMvcModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.test.serviceBuilder.model.impl.SpringMvcImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpringMvc
 * @generated
 */
@ProviderType
public interface SpringMvcModel
	extends BaseModel<SpringMvc>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a spring mvc model instance should use the {@link SpringMvc} interface instead.
	 */

	/**
	 * Returns the primary key of this spring mvc.
	 *
	 * @return the primary key of this spring mvc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this spring mvc.
	 *
	 * @param primaryKey the primary key of this spring mvc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this spring mvc.
	 *
	 * @return the uuid of this spring mvc
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this spring mvc.
	 *
	 * @param uuid the uuid of this spring mvc
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the group ID of this spring mvc.
	 *
	 * @return the group ID of this spring mvc
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this spring mvc.
	 *
	 * @param groupId the group ID of this spring mvc
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this spring mvc.
	 *
	 * @return the company ID of this spring mvc
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this spring mvc.
	 *
	 * @param companyId the company ID of this spring mvc
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this spring mvc.
	 *
	 * @return the user ID of this spring mvc
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this spring mvc.
	 *
	 * @param userId the user ID of this spring mvc
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this spring mvc.
	 *
	 * @return the user uuid of this spring mvc
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this spring mvc.
	 *
	 * @param userUuid the user uuid of this spring mvc
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this spring mvc.
	 *
	 * @return the user name of this spring mvc
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this spring mvc.
	 *
	 * @param userName the user name of this spring mvc
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this spring mvc.
	 *
	 * @return the create date of this spring mvc
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this spring mvc.
	 *
	 * @param createDate the create date of this spring mvc
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this spring mvc.
	 *
	 * @return the modified date of this spring mvc
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this spring mvc.
	 *
	 * @param modifiedDate the modified date of this spring mvc
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the ID of this spring mvc.
	 *
	 * @return the ID of this spring mvc
	 */
	public long getId();

	/**
	 * Sets the ID of this spring mvc.
	 *
	 * @param id the ID of this spring mvc
	 */
	public void setId(long id);

	/**
	 * Returns the first name of this spring mvc.
	 *
	 * @return the first name of this spring mvc
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this spring mvc.
	 *
	 * @param firstName the first name of this spring mvc
	 */
	public void setFirstName(String firstName);

	@Override
	public SpringMvc cloneWithOriginalValues();

}