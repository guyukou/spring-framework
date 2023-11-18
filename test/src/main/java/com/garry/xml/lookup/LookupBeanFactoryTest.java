package com.garry.xml.lookup;

import com.garry.beandefinition.MyTestBeanA;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class LookupBeanFactoryTest {

	public static void main(String[] args) {

		LookupBeanFactoryTest testClass = new LookupBeanFactoryTest();
		testClass.testSimpleLoad();
	}

	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("lookup.xml"));
		GetBeanTest bean = (GetBeanTest) bf.getBean("getBeanTest");
		bean.showMe();
	}
}
