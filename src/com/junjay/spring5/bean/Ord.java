package com.junjay.spring5.bean;

public class Ord {

	private String oname;

	public void setOname(String oname) {
		this.oname = oname;
		System.out.println("（2）：为bean的属性设置值和对其他bean引用（调用set方法）");
	}

	/**
	 * 生命周期 （1）：通过构造器创建bean实例（无参构造）
	 */
	public Ord() {
		super();
		System.out.println("（1）：通过构造器创建bean实例（无参构造）");
	}

	/**
	 * 调用bean的初始化方法
	 */
	public void init() {
		System.out.println("（3）：调用bean的初始化方法（需要进行配置）");
	}

	/**
	 * 对象销毁方法，需要在配置文件中配置,在配置文件中配置destroy-method，但不能使其销毁，
	 * 需要手动让bean实例销毁
	 */
	public void destroy() {
		System.out.println("（5）：当容器关闭的时候，调用bean的销毁的方法（需要进行配置销毁方法）");
	}

}
