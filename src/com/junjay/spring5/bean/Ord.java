package com.junjay.spring5.bean;

public class Ord {

	private String oname;

	public void setOname(String oname) {
		this.oname = oname;
		System.out.println("��2����Ϊbean����������ֵ�Ͷ�����bean���ã�����set������");
	}

	/**
	 * �������� ��1����ͨ������������beanʵ�����޲ι��죩
	 */
	public Ord() {
		super();
		System.out.println("��1����ͨ������������beanʵ�����޲ι��죩");
	}

	/**
	 * ����bean�ĳ�ʼ������
	 */
	public void init() {
		System.out.println("��3��������bean�ĳ�ʼ����������Ҫ�������ã�");
	}

	/**
	 * �������ٷ�������Ҫ�������ļ�������,�������ļ�������destroy-method��������ʹ�����٣�
	 * ��Ҫ�ֶ���beanʵ������
	 */
	public void destroy() {
		System.out.println("��5�����������رյ�ʱ�򣬵���bean�����ٵķ�������Ҫ�����������ٷ�����");
	}

}
