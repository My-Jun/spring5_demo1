package com.junjay.spring5.dao;

/**
 * implements 实现接口关键字
 * dao接口实现类
 * @author My
 *
 */
public  class UserDaoImpl implements UserDao{

	@Override
	public void add() {
		System.err.println("UserDaoImpl -------- add  ");
	}

	@Override
	public void update() {
		System.err.println("UserDaoImpl -------- update  ");		
	}

}
