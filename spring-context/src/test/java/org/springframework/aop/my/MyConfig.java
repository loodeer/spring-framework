package org.springframework.aop.my;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author luzuheng
 * @since 2021-11-10 10:04
 */
@Configuration
@ComponentScan("org.springframework.aop.my")
@EnableAspectJAutoProxy // 开启spring对注解AOP的支持
public class MyConfig {

}
