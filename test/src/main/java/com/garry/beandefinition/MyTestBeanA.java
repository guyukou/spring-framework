package com.garry.beandefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.io.File;
import java.util.Date;

public class MyTestBeanA implements ApplicationContextAware {
	private String testStr = "testStr";
	@Autowired
	private MyTestBeanB myTestBeanB;

	@Value("${ZSH}")
	private String zsh;

	private Date date;

	private BeanFactory beanFactory;

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public MyTestBeanB getMyTestBeanB() {
		return myTestBeanB;
	}

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void setMyTestBeanB(MyTestBeanB myTestBeanB) {
		this.myTestBeanB = myTestBeanB;
	}

	public String getZsh() {
		return zsh;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}
}
