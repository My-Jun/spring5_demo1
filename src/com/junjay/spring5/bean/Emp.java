package com.junjay.spring5.bean;

/**
 * @author Ա��ʵ��
 *
 */
public class Emp {

	private String ename;
	private String gender;
	// Ա������ĳһ����,ʹ�ö����ʾ
	private Dept dept;

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	// ����dept��get�������ܻ�ȡ��spring�����ļ���dept�����dept.dname
	public Dept getDept() {
		return dept;
	}

	public void add() {
		System.out.println("ename=" + ename);
		System.out.println("gender=" + gender);
		System.out.println(dept.toString());
	}

}
