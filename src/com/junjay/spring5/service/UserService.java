package com.junjay.spring5.service;

import com.junjay.spring5.dao.UserDao;

public class UserService {
	
	// 1 ����UserDao�������ԣ�����set��������������ע��
	private UserDao userDao;
	
//	public void setUserdao(UserDao userDao) {
//		this.userDao = userDao;
//	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	// ԭʼ����
	public void add() {
		System.err.println("service -------- add  ");
	}

}
