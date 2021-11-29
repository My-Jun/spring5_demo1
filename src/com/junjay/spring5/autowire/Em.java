package com.junjay.spring5.autowire;

public class Em {

	private Dep dep;

	public void setDep(Dep dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Em [dep=" + dep + "]";
	}
	
	public void test() {
		System.out.println(dep);
	}

}
