package com.garry.xml;

import com.garry.beandefinition.MyTestBeanA;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	public static void main(String[] args) {

		BeanFactoryTest testClass = new BeanFactoryTest();
		testClass.testSimpleLoad();
	}

	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBeanA bean = (MyTestBeanA) bf.getBean("myTestBeanA");
		System.out.println(bean.getTestStr());
	}
}
