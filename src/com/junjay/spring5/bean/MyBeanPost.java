package com.junjay.spring5.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 改类实现BeanPostProcessor接口
 * 只要实现改接口在创建所有对象时候都会调用
 * 
 * @author My
 *
 */
public class MyBeanPost implements BeanPostProcessor {

	/**
	 * bean是容器调用构造器创建的实例 beanName是实例的id 在所有初始化方法之前调用
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("(2.5)在bean初始化之前会调用的一个方法");
		return bean;
	}

	/**
	 * bean是容器调用构造器创建的实例 beanName是实例的id 在所有初始化方法之后调用
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("(3.5)在bean初始化之后会调用的一个方法");
		return bean;
	}

}
