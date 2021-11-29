package com.junjay.spring5;

public class Orders {
	
	// 订单名称
	private String oname="我是字面量设置的值";
	
	// 订单地址
	private String address;

	// 有参构造
	public Orders(String oname, String address) {
		super();
		this.oname = oname;
		this.address = address;
	}
	
	
	public void orderText() {
		System.err.println("oname="+oname);
		System.err.println("address="+address);
	}
	
	
	

}
