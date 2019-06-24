/**
 * 
 */
package com.lsn.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsn.springcloud.dao.DeptDao;
import com.lsn.springcloud.entities.Dept;

/**
 * @author LSN
 *
 */
@Service
public class DeptService
{
	@Autowired
	private DeptDao deptDao;
	
	public boolean add(Dept dept)
	{
		return deptDao.addDept(dept);
	}
	
	public Dept get(Long id)
	{
		return deptDao.findById(id);
	}
	
	public List<Dept> list()
	{
		return deptDao.findAll();
	}
}
