package com.spring.ioc;

public class MysqlConnection implements IocInterface {

	@Override
	public void Connect() {
	System.out.println("Connect to Mysql");
		
	}

}
