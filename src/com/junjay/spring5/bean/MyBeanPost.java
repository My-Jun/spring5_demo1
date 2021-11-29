package com.junjay.spring5.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ����ʵ��BeanPostProcessor�ӿ�
 * ֻҪʵ�ָĽӿ��ڴ������ж���ʱ�򶼻����
 * 
 * @author My
 *
 */
public class MyBeanPost implements BeanPostProcessor {

	/**
	 * bean���������ù�����������ʵ�� beanName��ʵ����id �����г�ʼ������֮ǰ����
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("(2.5)��bean��ʼ��֮ǰ����õ�һ������");
		return bean;
	}

	/**
	 * bean���������ù�����������ʵ�� beanName��ʵ����id �����г�ʼ������֮�����
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("(3.5)��bean��ʼ��֮�����õ�һ������");
		return bean;
	}

}
