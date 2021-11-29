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
	 * java��������ΪTest ����ļ���ΪTest���緢ʹ��@Test����ע��
	 */
	@Test
	public void testAdd() {
		// 1 ����spring�����ļ�
		
		// ClassPathXmlApplicationContext �����ļ��ļ���src��ʹ��
		// org.springframework.context ApplicationContext Ӧ��������
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		
		// ͨ��spring�����ļ���ȡ�����Ķ��� 
		// getBean("�����ļ�bean����id",���ض���Class)
		// ��ȡ�����ļ������Ķ���
		User user = context.getBean("user",User.class);
		System.out.println(user);
		user.add();
		// new FileSystemXmlApplicationContext(url) ��·����
	}
	
	
	
	@Test
	public void testAdd1() {
		// 1 ����spring�����ļ�
		
		// ClassPathXmlApplicationContext �����ļ��ļ���src��ʹ��
		// org.springframework.beans.factory.BeanFactory; 
		// BeanFactory  IOC��������ʵ�֣���spring�ڲ�ʹ�ýӿڣ����ṩ������Աʹ�ã�
		BeanFactory context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// ͨ��spring�����ļ���ȡ�����Ķ��� 
		// getBean("�����ļ�bean����id",���ض���Class)
		// ��ȡ�����ļ������Ķ���
		User user = context.getBean("user",User.class);
		System.out.println(user);
		user.add();
		
		// new FileSystemXmlApplicationContext(url) ��·����
	}
	
	@Test
	public void testAdd2() {
		// 1 ����spring�����ļ�
		
		// ClassPathXmlApplicationContext �����ļ��ļ���src��ʹ��
		// org.springframework.beans.factory.BeanFactory; 
		// BeanFactory  IOC��������ʵ�֣���spring�ڲ�ʹ�ýӿڣ����ṩ������Աʹ�ã�
		BeanFactory context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// ͨ��spring�����ļ���ȡ�����Ķ��� 
		// getBean("�����ļ�bean����id",���ض���Class)
		// ��ȡ�����ļ������Ķ���
		Book user = context.getBean("book",Book.class);
		System.out.println(user);
		user.testBname();
		
		// new FileSystemXmlApplicationContext(url) ��·����
	}
	
	
	
	@Test
	public void testAdd211() {
		// 1 ����spring�����ļ�
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// ͨ��spring�����ļ���ȡ�����Ķ��� 
		// getBean("�����ļ�bean����id",���ض���Class)
		// ��ȡ�����ļ������Ķ���
		Orders orders = context.getBean("orders",Orders.class);
		orders.orderText();
	}
	

 
}
