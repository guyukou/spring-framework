package com.garry.xml;

import com.garry.beandefinition.MyTestBeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author guyu06
 * @date 2022/8/28 10:07 上午
 */
public class ApplicationContextTest {
	public static void main(String[] args) {

		ApplicationContextTest testClass = new ApplicationContextTest();
		testClass.testSimpleLoad();
	}

	public void testSimpleLoad() {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		MyTestBeanA bean = (MyTestBeanA) cxt.getBean("myTestBeanA");
		System.out.println(bean.getDate());
//		System.out.println(bean.getMyTestBeanB());
//		System.out.println(bean.getTestStr());
	}

}
