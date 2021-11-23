package org.springframework.aop.my;

import org.junit.jupiter.api.Test;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luzuheng
 * @since 2021-11-10 10:03
 */
public class MyTests {

	@Test
	public void testAopProxyBuild() {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/lzh/workspace/git.hub/spring-framework/spring-context/src/test/java/org/springframework/aop/my/");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		MyBean bean = applicationContext.getBean(MyBean.class);
		bean.say("lzh");
	}
}
