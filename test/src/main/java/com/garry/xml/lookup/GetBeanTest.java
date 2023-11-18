package com.garry.xml.lookup;

/**
 * @author guyu06
 * @date 2022/9/11 11:07 上午
 */
public abstract class GetBeanTest {
	public void showMe() {
		getBean().showMe();
	}

	public abstract User getBean();
}
