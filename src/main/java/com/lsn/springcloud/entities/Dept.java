/**
 * 
 */
package com.lsn.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author LSN
 *
 */
@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain= true)//链式访问法
public class Dept implements Serializable
{
	private Long deptno;
	private String dname;
	private String db_source;//每一个微服务可以有自己独立的数据库
	
	public static void main(String[] args)
	{
		Dept dept = new Dept(1L,"fsdfsdf","ffsdaf");
		System.out.println(dept);
	}
	
	
}
