package com.garry.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("aspectTest.xml");
		TestBean bean = (TestBean) bf.getBean("test");
		bean.test();
	}
}
