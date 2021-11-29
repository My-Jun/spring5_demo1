package com.junjay.spring5.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * mybean 普通类先实现FactoryBean接口
 * 实现接口后需要重写接口内方法
 * @author My
 *
 */
public class MyBean implements FactoryBean{

	/**
	 * 设置返回类型
	 */
	@Override
	public Cou getObject() throws Exception {
		Cou cou = new Cou();
		cou.setCname("222");
		return cou;
	}

	@Override
	public Class getObjectType() {
		return null;
	}

}
