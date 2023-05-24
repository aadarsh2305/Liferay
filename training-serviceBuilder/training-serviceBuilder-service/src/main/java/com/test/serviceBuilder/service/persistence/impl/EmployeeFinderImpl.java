package com.test.serviceBuilder.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.test.serviceBuilder.service.persistence.EmployeeFinder;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = EmployeeFinder.class)
public class EmployeeFinderImpl extends EmployeeFinderBaseImpl implements EmployeeFinder {

	@Reference
	private CustomSQL customSql;
	
	private static final Log log = LogFactoryUtil.getLog(EmployeeFinderImpl.class.getName());

	@SuppressWarnings("unchecked")
	public List<Object[]> getEmployeesByName(String name) {
		Session session = null;
		try {
			session = openSession();
			String sql = customSql.get(getClass(), "com.test.serviceBuilder.service.persistence.impl.EmployeeFinderImpl.findByEmployee");
			System.out.println("Query==>" + sql);
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.setCacheable(false);
			
			log.info("ServiceBuilder >>> Persistence.Impl >>> EmployeeFinderImpl >>> getEmployeesByName >>> sqlQuery:::::"+sqlQuery);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add("%"+name+"%");
			queryPos.add("%"+name+"%");
			queryPos.add("%"+name+"%");
			queryPos.add("%"+name+"%");

			log.info("ServiceBuilder >>> Persistence.Impl >>> EmployeeFinderImpl >>> getEmployeesByName >>> queryPos:::::"+queryPos);
			return (List<Object[]>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> getEmployeeBeanNameById(long id) {
		Session session = null;
		try {
			session = openSession();
			String sql = customSql.get(getClass(), "com.test.serviceBuilder.service.persistence.impl.EmployeeFinderImpl.getEmployeeBeanNameById");
			System.out.println("Query==>" + sql);
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.setCacheable(false);
			
			log.info("ServiceBuilder >>> Persistence.Impl >>> EmployeeFinderImpl >>> getEmployeeBeanNameById >>> sqlQuery:::::"+sqlQuery);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(id);

			log.info("ServiceBuilder >>> Persistence.Impl >>> EmployeeFinderImpl >>> getEmployeeBeanNameById >>> queryPos:::::"+queryPos);
			return (List<Object[]>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;

	}
	
	
}
