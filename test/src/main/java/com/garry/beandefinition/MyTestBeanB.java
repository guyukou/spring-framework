package com.garry.beandefinition;

import org.springframework.beans.factory.annotation.Autowired;

public class MyTestBeanB {
	private String testStr = "testStr";

	@Autowired
	private MyTestBeanA myTestBeanA;

	public MyTestBeanA getMyTestBeanA() {
		return myTestBeanA;
	}

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
}
