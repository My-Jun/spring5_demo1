package com.junjay.spring5.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.junjay.spring5.Book;
import com.junjay.spring5.Orders;
import com.junjay.spring5.User;

public class TestSpring5 {
	
	/**
	 * java类名不能为Test 如果文件名为Test则午发使用@Test测试注解
	 */
	@Test
	public void testAdd() {
		// 1 加载spring配置文件
		
		// ClassPathXmlApplicationContext 配置文件文件在src下使用
		// org.springframework.context ApplicationContext 应用上下文
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		
		// 通过spring配置文件获取创建的对象 
		// getBean("配置文件bean——id",返回对象Class)
		// 获取配置文件创建的对象
		User user = context.getBean("user",User.class);
		System.out.println(user);
		user.add();
		// new FileSystemXmlApplicationContext(url) 在路徑下
	}
	
	
	
	@Test
	public void testAdd1() {
		// 1 加载spring配置文件
		
		// ClassPathXmlApplicationContext 配置文件文件在src下使用
		// org.springframework.beans.factory.BeanFactory; 
		// BeanFactory  IOC容器基本实现，是spring内部使用接口，不提供开发人员使用；
		BeanFactory context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// 通过spring配置文件获取创建的对象 
		// getBean("配置文件bean——id",返回对象Class)
		// 获取配置文件创建的对象
		User user = context.getBean("user",User.class);
		System.out.println(user);
		user.add();
		
		// new FileSystemXmlApplicationContext(url) 在路徑下
	}
	
	@Test
	public void testAdd2() {
		// 1 加载spring配置文件
		
		// ClassPathXmlApplicationContext 配置文件文件在src下使用
		// org.springframework.beans.factory.BeanFactory; 
		// BeanFactory  IOC容器基本实现，是spring内部使用接口，不提供开发人员使用；
		BeanFactory context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// 通过spring配置文件获取创建的对象 
		// getBean("配置文件bean——id",返回对象Class)
		// 获取配置文件创建的对象
		Book user = context.getBean("book",Book.class);
		System.out.println(user);
		user.testBname();
		
		// new FileSystemXmlApplicationContext(url) 在路徑下
	}
	
	
	
	@Test
	public void testAdd211() {
		// 1 加载spring配置文件
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// 通过spring配置文件获取创建的对象 
		// getBean("配置文件bean——id",返回对象Class)
		// 获取配置文件创建的对象
		Orders orders = context.getBean("orders",Orders.class);
		orders.orderText();
	}
	

 
}
