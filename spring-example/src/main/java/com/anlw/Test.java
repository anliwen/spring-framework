package com.anlw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author anliwen
 */
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		HelloWorld hw = (HelloWorld) context.getBean("hw");
		hw.show();
	}
}