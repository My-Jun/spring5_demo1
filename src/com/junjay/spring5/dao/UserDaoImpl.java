package com.junjay.spring5.dao;

/**
 * implements ʵ�ֽӿڹؼ���
 * dao�ӿ�ʵ����
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
