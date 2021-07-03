package com.spring.ioc;

public class Connection {
private IocInterface referance;

public Connection(IocInterface referance) {
	this.referance=referance;
}

public void conn() {
	
referance.Connect();
}

}
