package com.garry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * JavaConfig.
 * @author garry a
 */
@Configuration
@ComponentScan
public class JavaConfig {
	@Lazy
	@Bean
	public User user(){
		return new User("001","Jack");
	}
}
