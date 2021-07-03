package com.spring.ioc;

public class OracleConnection implements IocInterface {

	@Override
	public void Connect() {
		System.out.println("Connect to Oracle");
		
	}

}
