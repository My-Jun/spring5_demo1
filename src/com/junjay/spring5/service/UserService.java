package com.junjay.spring5.service;

import com.junjay.spring5.dao.UserDao;

public class UserService {
	
	// 1 创建UserDao类型属性，生产set方法，进行依赖注入
	private UserDao userDao;
	
//	public void setUserdao(UserDao userDao) {
//		this.userDao = userDao;
//	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	// 原始方法
	public void add() {
		System.err.println("service -------- add  ");
	}

}
