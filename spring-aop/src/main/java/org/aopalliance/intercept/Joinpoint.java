/*
 * Copyright 2002-2021 the original author or authors.
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

package org.aopalliance.intercept;

import java.lang.reflect.AccessibleObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * This interface represents a generic runtime joinpoint (in the AOP
 * terminology). | 这个接口表示一个通用的运行时连接点
 *
 * <p>A runtime joinpoint is an <i>event</i> that occurs on a static | 运行时连接点是发生在静态连接点上的 事件
 * joinpoint (i.e. a location in a program). For instance, an
 * invocation is the runtime joinpoint on a method (static joinpoint). | 例如，调用是方法上的运行时连接点(静态连接点)。
 * The static part of a given joinpoint can be generically retrieved
 * using the {@link #getStaticPart()} method.
 *
 * <p>In the context of an interception framework, a runtime joinpoint | 具有拦截功能的框架中说的运行时连接点，通常是指 对可访问对象的 具象化
 * is then the reification of an access to an accessible object (a
 * method, a constructor, a field), i.e. the static part of the
 * joinpoint. It is passed to the interceptors that are installed on
 * the static joinpoint. | 连接点作为参数传给拦截器使用。
 *
 * @author Rod Johnson
 * @see Interceptor
 */
public interface Joinpoint {

	/**
	 * Proceed to the next interceptor in the chain. | 继续执行下一个拦截器
	 * <p>The implementation and the semantics of this method depends
	 * on the actual joinpoint type (see the children interfaces).
	 * @return see the children interfaces' proceed definition
	 * @throws Throwable if the joinpoint throws an exception
	 */
	@Nullable
	Object proceed() throws Throwable;

	/**
	 * Return the object that holds the current joinpoint's static part.
	 * <p>For instance, the target object for an invocation.
	 * @return the object (can be null if the accessible object is static)
	 */
	@Nullable
	Object getThis();

	/**
	 * Return the static part of this joinpoint.
	 * <p>The static part is an accessible object on which a chain of
	 * interceptors are installed.
	 */
	@Nonnull
	AccessibleObject getStaticPart();

}
