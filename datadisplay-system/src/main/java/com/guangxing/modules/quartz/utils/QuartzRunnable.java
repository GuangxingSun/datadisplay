/*
 *  Copyright 2019-2020 Guangxing
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.guangxing.modules.quartz.utils;

import com.guangxing.utils.SpringContextHolder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/**
 * 执行定时任务
 * @author /
 */
public class QuartzRunnable implements Callable {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(QuartzRunnable.class);
    private final Object target;
	private final Method method;
	private final String params;

	QuartzRunnable(String beanName, String methodName, String params)
			throws NoSuchMethodException, SecurityException {
		this.target = SpringContextHolder.getBean(beanName);
		this.params = params;

		if (StringUtils.isNotBlank(params)) {
			this.method = target.getClass().getDeclaredMethod(methodName, String.class);
		} else {
			this.method = target.getClass().getDeclaredMethod(methodName);
		}
	}

	@Override
	public Object call() throws Exception {
		ReflectionUtils.makeAccessible(method);
		if (StringUtils.isNotBlank(params)) {
			method.invoke(target, params);
		} else {
			method.invoke(target);
		}
		return null;
	}
}
