package com.junjay.spring5.collectionbean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {

	// �������� ����
	private String[] sarr;

	// List������������
	private List slist;

	// Map������������
	private Map<String, String> smap;

	// Set��������
	private Set<String> set;

	// ���϶���
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
	 * �����ӡ
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
