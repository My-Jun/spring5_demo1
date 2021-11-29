package com.junjay.spring5.collectionbean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {

	// 数组类型 属性
	private String[] sarr;

	// List集合类型属性
	private List slist;

	// Map集合类型属性
	private Map<String, String> smap;

	// Set集合属性
	private Set<String> set;

	// 集合对象
	private List<Cos> cosList;

	public void setSarr(String[] sarr) {
		this.sarr = sarr;
	}

	public void setSlist(List slist) {
		this.slist = slist;
	}

	public void setSmap(Map<String, String> smap) {
		this.smap = smap;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setCosList(List<Cos> cosList) {
		this.cosList = cosList;
	}

	/**
	 * 数组打印
	 */
	public void getArr() {
		System.out.println(Arrays.toString(sarr));
	}

	public void getList() {
		System.out.println(slist);
	}

	public void getMap() {
		System.out.println(smap);
	}

	public void getSet() {
		System.out.println(set);
	}

	public void setlistvo() {
		System.out.println(cosList);
	}

}
