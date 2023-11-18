package com.garry.annotation;

import com.garry.beandefinition.MyTestBeanA;
import com.garry.beandefinition.MyTestBeanB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guyu06
 * @date 2022/8/28 11:26 上午
 */
@Configuration
public class AnnotationConfig {

	@Bean
	public MyTestBeanA myTestBeanA() {
		return new MyTestBeanA();
	}

	@Bean
	public MyTestBeanB myTestBeanB() {
		return new MyTestBeanB();
	}
}
