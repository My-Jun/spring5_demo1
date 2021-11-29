package com.junjay.spring5;

/**
 * User对象
 * 
 * @author My
 *
 */
public class User {

	/**
	 * 属性
	 */
	private String userName;

	/**
	 * 有参构造
	 * @param userName
	 */
	public User(String userName) {
		super();
		this.userName = userName;
	}



	public void add() {
		System.out.println("this add...");
	}

}
