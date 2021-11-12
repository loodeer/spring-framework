package org.springframework.aop.my;

import org.springframework.stereotype.Component;

/**
 * @author luzuheng
 * @since 2021-11-10 10:00
 */
@Component
public class MyBean {

	public void say() {
		System.out.println("HELLO WORLD...");
	}

	public void say(String name) {
		System.out.println("Hello " + name);
	}
}
