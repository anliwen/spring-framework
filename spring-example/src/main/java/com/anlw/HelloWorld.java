package com.anlw;

/**
 * @author anliwen
 */
public class HelloWorld {
	private String name;

	public void show() {
		System.out.println("Welcome to Spring~~" + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}