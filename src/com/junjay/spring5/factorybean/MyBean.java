package com.junjay.spring5.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * mybean ��ͨ����ʵ��FactoryBean�ӿ�
 * ʵ�ֽӿں���Ҫ��д�ӿ��ڷ���
 * @author My
 *
 */
public class MyBean implements FactoryBean{

	/**
	 * ���÷�������
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
