package com.junjay.spring5;

public class Orders {
	
	// ��������
	private String oname="�������������õ�ֵ";
	
	// ������ַ
	private String address;

	// �вι���
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
