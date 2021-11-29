package com.junjay.spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;
import com.junjay.spring5.autowire.Em;
import com.junjay.spring5.bean.Emp;
import com.junjay.spring5.bean.Ord;
import com.junjay.spring5.collectionbean.Boss;
import com.junjay.spring5.collectionbean.Stu;
import com.junjay.spring5.factorybean.Cou;
import com.junjay.spring5.service.UserService;

public class TextBean {

	@Test
	public void testUserServiceAdd() {
		// 1 ����spring�����ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		// ͨ��spring�����ļ���ȡ�����Ķ���
		// getBean("�����ļ�bean����id",���ض���Class)
		// ��ȡ�����ļ������Ķ���
		UserService userService = context.getBean("userService", UserService.class);
		userService.add();
	}

	@Test
	public void testEpt() {
		// 1 ����spring�����ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
		// ͨ��spring�����ļ���ȡ�����Ķ���
		// getBean("�����ļ�bean����id",���ض���Class)
		// ��ȡ�����ļ������Ķ���
		Emp emp = context.getBean("emp", Emp.class);
		emp.add();
	}

	@Test
	public void testStu() {
		// 1 ����spring�����ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
		// ͨ��spring�����ļ���ȡ�����Ķ���
		// getBean("�����ļ�bean����id",���ض���Class)
		// ��ȡ�����ļ������Ķ���
		Stu stu = context.getBean("stu", Stu.class);
//		stu.getArr();
//		stu.getList();
//		stu.getMap();
//		stu.getSet();
		stu.setlistvo();
	}

	@Test
	public void testBoss() {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");

		// ���scope="prototype"���ڼ���bean6�����ļ�ʱ�򲻴��������ڵ���getBeanʱ��Ŵ�������
		// ��ÿ�δ����Ķ��󶼵�����һ�����󣬶�Ӧ�ڴ��ַҲ����ͬ����Ϊ��ʵ������
		Boss boss1 = context.getBean("boss", Boss.class);
		Boss boss2 = context.getBean("boss", Boss.class);
		System.out.println(boss1);
		System.out.println(boss2);

	}

	@Test
	public void testMyBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
		// �����ļ��ж������id = mybean
		// class ����ҲΪ MyBean
		// ͨ��ʵ��FactoryBean�ӿ� ��дgetObject����ʹ�÷��ؽ�������������ļ���һ��
		Cou mybean = context.getBean("mybean", Cou.class);
		System.out.println(mybean.toString());
	}

	@Test
	public void testOrd() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
		// ͨ������xml�ļ���ȡcontext����ͨ������getbean��������bean
		Ord ord = context.getBean("ord", Ord.class);
		System.out.println("��4����beanʵ�������ɹ��õ�bean����");
		// �������
		System.out.println("��ȡ��ǰ�����ļ��д�����bean��" + ord);
		// ����bean����� ord�е�destroy()�����������ļ�������ֻ�����õ��õķ�����ʵ�ʻ���Ҫ�ֶ���������
		context.close();

	}

	@Test
	public void testEmp() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean9.xml");
		// �����ļ��ж������id = mybean
		// class ����ҲΪ MyBean
		// ͨ��ʵ��FactoryBean�ӿ� ��дgetObject����ʹ�÷��ؽ�������������ļ���һ��
		Em em = context.getBean("em", Em.class);
		em.test();
	}

	@Test
	public void testDataSource() {
		ApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
		DruidDataSource dds = context.getBean("dataSource", DruidDataSource.class);
		System.out.println(dds.getUrl());
		System.out.println(dds.getUsername());

	}

}
