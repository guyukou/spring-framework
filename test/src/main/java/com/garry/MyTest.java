package com.garry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		System.out.println("hello");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
