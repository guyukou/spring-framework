package com.garry.beandefinition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class G_BeanDefinition {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		GenericBeanDefinition bd = new GenericBeanDefinition();
		bd.setBeanClass(G_Bean.class);
		bd.setScope(BeanDefinition.SCOPE_SINGLETON);
		bd.setAttribute("name", "garry");
		bd.setAttribute("age", "30");
		// 注册beanDefinition
		context.registerBeanDefinition("child", bd);
		context.refresh();

		BeanDefinition rawBeanDefinition = context.getBeanFactory().getBeanDefinition("child");
		BeanDefinition mergedBeanDefinition = context.getBeanFactory().getMergedBeanDefinition("child");
		System.out.println(rawBeanDefinition);
		System.out.println(mergedBeanDefinition);

	}
}
