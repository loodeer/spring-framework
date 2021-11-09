package org.springframework.context.my;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luzuheng
 * @since 2021-11-09 14:02
 */
public class MyTests {

	@Test
	public void testIoC() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("MyBean.xml", getClass());
		MyBean myBean = applicationContext.getBean(MyBean.class);
		System.out.println(myBean);
	}
}
