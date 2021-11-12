package org.springframework.aop.my;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luzuheng
 * @since 2021-11-10 10:03
 */
public class MyTests {

	@Test
	public void testAopProxyBuild() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		MyBean bean = applicationContext.getBean(MyBean.class);
		bean.say();
		bean.say("lzh");
	}
}
