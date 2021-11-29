package com.junjay.spring5.collectionbean;

import java.util.List;

public class Boss {

	private List<String> blist;

	public void setBlist(List<String> blist) {
		this.blist = blist;
	}

	public void test() {
		System.out.println(blist);

	}

}
