package com.garry.autoscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoScanMain {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AutoScanConfig.class);
		AutoScanService bean = ctx.getBean(AutoScanService.class);
		System.out.println("finished getting bean, cost " + (System.currentTimeMillis()-start)/1000 + "s");
	}
}
