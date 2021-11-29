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
		// 1 加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		// 通过spring配置文件获取创建的对象
		// getBean("配置文件bean——id",返回对象Class)
		// 获取配置文件创建的对象
		UserService userService = context.getBean("userService", UserService.class);
		userService.add();
	}

	@Test
	public void testEpt() {
		// 1 加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
		// 通过spring配置文件获取创建的对象
		// getBean("配置文件bean——id",返回对象Class)
		// 获取配置文件创建的对象
		Emp emp = context.getBean("emp", Emp.class);
		emp.add();
	}

	@Test
	public void testStu() {
		// 1 加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
		// 通过spring配置文件获取创建的对象
		// getBean("配置文件bean——id",返回对象Class)
		// 获取配置文件创建的对象
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

		// 如果scope="prototype"则，在加载bean6配置文件时候不创建对象，在调用getBean时候才创建对象
		// 且每次创建的对象都单独的一个对象，对应内存地址也不相同，即为多实例创建
		Boss boss1 = context.getBean("boss", Boss.class);
		Boss boss2 = context.getBean("boss", Boss.class);
		System.out.println(boss1);
		System.out.println(boss2);

	}

	@Test
	public void testMyBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
		// 配置文件中定义的是id = mybean
		// class 类型也为 MyBean
		// 通过实现FactoryBean接口 重写getObject方法使得返回结果类型与配置文件不一样
		Cou mybean = context.getBean("mybean", Cou.class);
		System.out.println(mybean.toString());
	}

	@Test
	public void testOrd() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
		// 通过解析xml文件获取context对象，通过调用getbean方法创建bean
		Ord ord = context.getBean("ord", Ord.class);
		System.out.println("（4）：bean实例创建成功得到bean对象");
		// 输出对象
		System.out.println("获取当前配置文件中创建的bean：" + ord);
		// 销毁bean则调用 ord中的destroy()方法，配置文件中配置只是配置调用的方法，实际还需要手动进行销毁
		context.close();

	}

	@Test
	public void testEmp() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean9.xml");
		// 配置文件中定义的是id = mybean
		// class 类型也为 MyBean
		// 通过实现FactoryBean接口 重写getObject方法使得返回结果类型与配置文件不一样
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
