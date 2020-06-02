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
package com.guangxing.config.thread;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 线程池配置属性类
 * @author https://juejin.im/entry/5abb8f6951882555677e9da2
 * @date 2019年10月31日14:58:18
 */
@Component
@ConfigurationProperties(prefix = "task.pool")
public class AsyncTaskProperties {

    private int corePoolSize;

    private int maxPoolSize;

    private int keepAliveSeconds;

    private int queueCapacity;

    public AsyncTaskProperties() {
    }

    public int getCorePoolSize() {
        return this.corePoolSize;
    }

    public int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public int getKeepAliveSeconds() {
        return this.keepAliveSeconds;
    }

    public int getQueueCapacity() {
        return this.queueCapacity;
    }

    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public void setKeepAliveSeconds(int keepAliveSeconds) {
        this.keepAliveSeconds = keepAliveSeconds;
    }

    public void setQueueCapacity(int queueCapacity) {
        this.queueCapacity = queueCapacity;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AsyncTaskProperties)) return false;
        final AsyncTaskProperties other = (AsyncTaskProperties) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getCorePoolSize() != other.getCorePoolSize()) return false;
        if (this.getMaxPoolSize() != other.getMaxPoolSize()) return false;
        if (this.getKeepAliveSeconds() != other.getKeepAliveSeconds()) return false;
        if (this.getQueueCapacity() != other.getQueueCapacity()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AsyncTaskProperties;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getCorePoolSize();
        result = result * PRIME + this.getMaxPoolSize();
        result = result * PRIME + this.getKeepAliveSeconds();
        result = result * PRIME + this.getQueueCapacity();
        return result;
    }

    public String toString() {
        return "AsyncTaskProperties(corePoolSize=" + this.getCorePoolSize() + ", maxPoolSize=" + this.getMaxPoolSize() + ", keepAliveSeconds=" + this.getKeepAliveSeconds() + ", queueCapacity=" + this.getQueueCapacity() + ")";
    }
}
