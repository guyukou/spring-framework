package com.garry.autoscan;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

//@Service
public class AutoScanService2 implements InitializingBean {
	@PostConstruct
	public void init() {
		long start = System.currentTimeMillis();
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("2finished postconstruct, cost " + (System.currentTimeMillis()-start)/1000 + "s");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		long start = System.currentTimeMillis();
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("2finished initializing, cost " + (System.currentTimeMillis()-start)/1000 + "s");
	}
}
