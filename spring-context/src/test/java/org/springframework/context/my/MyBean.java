package org.springframework.context.my;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author luzuheng
 * @since 2021-11-09 13:57
 */
public class MyBean implements InitializingBean {

	public MyBean() {
		System.out.println("4.MyBean 构造器...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6.MyBean afterPropertiesSet...");
	}
}
