package com.junjay.spring5;

public class Book {

	// �������� �ɶ��
	private String bname;
	
	private String zname;

	// set����
	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setZname(String zname) {
		this.zname = zname;
	}



	public void testBname() {
		System.out.println("xmlע��bnameֵ��"+bname);
		System.out.println("xmlע��znameֵ��"+zname);
	}
	
}
	// �вι���
//	public Book(String bname) {
//		super();
//		this.bname = bname;
//	}

	// �޲ι���
//	public Book() {
//	}
//	public static void main(String[] args) {
//		// 1:�вι���ע������
//		Book book = new Book("222");
//		// 2:setע��
//		book.setBname("111");
//	}


