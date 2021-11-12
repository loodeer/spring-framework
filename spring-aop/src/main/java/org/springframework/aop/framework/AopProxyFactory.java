/*
 * Copyright 2002-2012 the original author or authors.
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

package org.springframework.aop.framework;

/**
 * Interface to be implemented by factories that are able to create
 * AOP proxies based on {@link AdvisedSupport} configuration objects.
 *
 * <p>Proxies should observe the following contract: | 代理应遵守以下准则(合同)
 * <ul>
 * <li>They should implement all interfaces that the configuration
 * indicates should be proxied. | 实现 advisedSupport配置里配置需要被代理的 所有接口
 * <li>They should implement the {@link Advised} interface. | 实现 Advised 接口
 * <li>They should implement the equals method to compare proxied
 * interfaces, advice, and target. | 实现 equals 方法用来比较代理接口、通知、目标
 * <li>They should be serializable if all advisors and target
 * are serializable. | 如果所有的 advisor 和 target 都是可序列化的，代理也需要是可序列化的。
 * <li>They should be thread-safe if advisors and target
 * are thread-safe. | 如果所有的 advisor 和 target 都是线程安全的，代理也需要是线程安全的。
 * </ul>
 *
 * <p>Proxies may or may not allow advice changes to be made. | 代理可决定advice是否可修改。
 * If they do not permit advice changes (for example, because
 * the configuration was frozen) a proxy should throw an
 * {@link AopConfigException} on an attempted advice change. | 如果不允许advice修改，在修改advice时，需要抛出AopConfigException
 *
 * @author Rod Johnson
 * @author Juergen Hoeller
 */
public interface AopProxyFactory {

	/**
	 * Create an {@link AopProxy} for the given AOP configuration.
	 * @param config the AOP configuration in the form of an
	 * AdvisedSupport object
	 * @return the corresponding AOP proxy
	 * @throws AopConfigException if the configuration is invalid
	 */
	AopProxy createAopProxy(AdvisedSupport config) throws AopConfigException;

}
