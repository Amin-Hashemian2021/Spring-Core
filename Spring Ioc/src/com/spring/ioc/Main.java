package com.spring.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Connection obj=new Connection((IocInterface) context.getBean("database",IocInterface.class));
	obj.conn();
}
}
