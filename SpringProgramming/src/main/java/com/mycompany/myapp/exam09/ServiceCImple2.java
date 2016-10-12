package com.mycompany.myapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceCImple2 implements ServiceD{
	private static final Logger logger = LoggerFactory.getLogger(ServiceCImple2.class);

	public ServiceCImple2() {
		logger.info("ServiceCImple2 객체 생성");
	}
	
	@Override
	public void method() {
		logger.info("method  실행");
	}
}
