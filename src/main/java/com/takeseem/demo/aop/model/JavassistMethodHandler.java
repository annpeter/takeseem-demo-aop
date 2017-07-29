/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.takeseem.demo.aop.model;

import java.lang.reflect.Method;

import javassist.util.proxy.MethodHandler;

/**
 * @author <a href="mailto:yh@takeseem.com">杨浩</a>
 */
public class JavassistMethodHandler implements MethodHandler {
	private final Object target;
	
	public JavassistMethodHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Throwable {
		return thisMethod.invoke(target, args);
	}

}
