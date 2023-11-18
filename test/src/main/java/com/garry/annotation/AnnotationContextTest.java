package com.garry.annotation;

import com.garry.beandefinition.MyTestBeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author guyu06
 * @date 2022/8/28 11:26 上午
 */
public class AnnotationContextTest {
	public static void main(String[] args) {
		AnnotationContextTest annotationContextTest = new AnnotationContextTest();
		annotationContextTest.testSimpleLoad();
	}

	private void testSimpleLoad() {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		MyTestBeanA bean = (MyTestBeanA) cxt.getBean("myTestBeanA");
		System.out.println("bean.getZsh() = " + bean.getZsh());
	}

}
