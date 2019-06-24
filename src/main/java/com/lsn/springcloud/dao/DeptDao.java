/**
 * 
 */
package com.lsn.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lsn.springcloud.entities.Dept;

/**
 * @author LSN
 *
 */
@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
