package com.junjay.spring5.bean;

/**
 * @author 员工实体
 *
 */
public class Emp {

	private String ename;
	private String gender;
	// 员工属于某一部门,使用对象表示
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

	// 生成dept的get方法才能获取到spring配置文件中dept对象的dept.dname
	public Dept getDept() {
		return dept;
	}

	public void add() {
		System.out.println("ename=" + ename);
		System.out.println("gender=" + gender);
		System.out.println(dept.toString());
	}

}
