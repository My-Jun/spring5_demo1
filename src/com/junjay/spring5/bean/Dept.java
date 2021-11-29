package com.junjay.spring5.bean;

/**
 * @author 部门实体类
 *
 */
public class Dept {

	private String dname;

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept [dname=" + dname + "]";
	}

}
