/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.aop;

/**
 * Marker interface implemented by all AOP proxies. Used to detect | AOP代理标记接口
 * whether or not objects are Spring-generated proxies. | 用于检测是否是 Spring 生成的代理
 *
 * @author Rob Harrop
 * @since 2.0.1
 * @see org.springframework.aop.support.AopUtils#isAopProxy(Object) | 看一下isAopProxy方法就清楚了
 */
public interface SpringProxy {

}
