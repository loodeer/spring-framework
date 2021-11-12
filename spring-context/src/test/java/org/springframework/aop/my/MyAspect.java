package org.springframework.aop.my;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author luzuheng
 * @since 2021-11-10 10:01
 */
@Component
@Aspect
public class MyAspect {

	// 全匹配方式 public void org.springframework.aop.my.MyBean.say(java.lang.String) 测试通过
	// 访问修饰符可以省略 void org.springframework.aop.my.MyBean.say(java.lang.String)
	// 返回值可以使用*，表示任意返回值 * org.springframework.aop.my.MyBean.say(java.lang.String)
	// 包名可以使用.表示，但是有几级包，必须写几个 * ....MyBean.say(java.lang.String)
	// 包名可以使用..表示当前包及其子包 * ..MyBean.say(java.lang.String)
	// 类名和方法名都可以使用.表示任意类，任意方法 * ....(java.lang.String)
	@Pointcut("execution(* org.springframework.aop.my.MyBean.say(java.lang.String))")
	public void pointcut() {

	}

	@Before("pointcut()")
	public void before() {
		System.out.println("before method ...");
	}
}
