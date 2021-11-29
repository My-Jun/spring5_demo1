package com.junjay.spring5;

public class Book {

	// 创建属性 可多个
	private String bname;
	
	private String zname;

	// set方法
	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setZname(String zname) {
		this.zname = zname;
	}



	public void testBname() {
		System.out.println("xml注入bname值："+bname);
		System.out.println("xml注入zname值："+zname);
	}
	
}
	// 有参构造
//	public Book(String bname) {
//		super();
//		this.bname = bname;
//	}

	// 无参构造
//	public Book() {
//	}
//	public static void main(String[] args) {
//		// 1:有参构造注入属性
//		Book book = new Book("222");
//		// 2:set注入
//		book.setBname("111");
//	}


