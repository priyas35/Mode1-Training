package com.fault;

import javax.xml.ws.Endpoint;

public class WSPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:1111/helloworld", new HelloWorld());
	}
}
