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
package com.guangxing.config;

import com.guangxing.utils.DataDisplayConstant;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Guangxing
 */
@Configuration
@ConfigurationProperties(prefix = "file")
public class FileProperties {

    /** 文件大小限制 */
    private Long maxSize;

    /** 头像大小限制 */
    private Long avatarMaxSize;

    private DDPath mac;

    private DDPath linux;

    private DDPath windows;

    public FileProperties() {
    }

    public DDPath getPath(){
        String os = System.getProperty("os.name");
        if(os.toLowerCase().startsWith(DataDisplayConstant.WIN)) {
            return windows;
        } else if(os.toLowerCase().startsWith(DataDisplayConstant.MAC)){
            return mac;
        }
        return linux;
    }

    public Long getMaxSize() {
        return this.maxSize;
    }

    public Long getAvatarMaxSize() {
        return this.avatarMaxSize;
    }

    public DDPath getMac() {
        return this.mac;
    }

    public DDPath getLinux() {
        return this.linux;
    }

    public DDPath getWindows() {
        return this.windows;
    }

    public void setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
    }

    public void setAvatarMaxSize(Long avatarMaxSize) {
        this.avatarMaxSize = avatarMaxSize;
    }

    public void setMac(DDPath mac) {
        this.mac = mac;
    }

    public void setLinux(DDPath linux) {
        this.linux = linux;
    }

    public void setWindows(DDPath windows) {
        this.windows = windows;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FileProperties)) return false;
        final FileProperties other = (FileProperties) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$maxSize = this.getMaxSize();
        final Object other$maxSize = other.getMaxSize();
        if (this$maxSize == null ? other$maxSize != null : !this$maxSize.equals(other$maxSize)) return false;
        final Object this$avatarMaxSize = this.getAvatarMaxSize();
        final Object other$avatarMaxSize = other.getAvatarMaxSize();
        if (this$avatarMaxSize == null ? other$avatarMaxSize != null : !this$avatarMaxSize.equals(other$avatarMaxSize))
            return false;
        final Object this$mac = this.getMac();
        final Object other$mac = other.getMac();
        if (this$mac == null ? other$mac != null : !this$mac.equals(other$mac)) return false;
        final Object this$linux = this.getLinux();
        final Object other$linux = other.getLinux();
        if (this$linux == null ? other$linux != null : !this$linux.equals(other$linux)) return false;
        final Object this$windows = this.getWindows();
        final Object other$windows = other.getWindows();
        if (this$windows == null ? other$windows != null : !this$windows.equals(other$windows)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FileProperties;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $maxSize = this.getMaxSize();
        result = result * PRIME + ($maxSize == null ? 43 : $maxSize.hashCode());
        final Object $avatarMaxSize = this.getAvatarMaxSize();
        result = result * PRIME + ($avatarMaxSize == null ? 43 : $avatarMaxSize.hashCode());
        final Object $mac = this.getMac();
        result = result * PRIME + ($mac == null ? 43 : $mac.hashCode());
        final Object $linux = this.getLinux();
        result = result * PRIME + ($linux == null ? 43 : $linux.hashCode());
        final Object $windows = this.getWindows();
        result = result * PRIME + ($windows == null ? 43 : $windows.hashCode());
        return result;
    }

    public String toString() {
        return "FileProperties(maxSize=" + this.getMaxSize() + ", avatarMaxSize=" + this.getAvatarMaxSize() + ", mac=" + this.getMac() + ", linux=" + this.getLinux() + ", windows=" + this.getWindows() + ")";
    }

    public static class DDPath{

        private String path;

        private String avatar;

        public DDPath() {
        }

        public String getPath() {
            return this.path;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof DDPath)) return false;
            final DDPath other = (DDPath) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$path = this.getPath();
            final Object other$path = other.getPath();
            if (this$path == null ? other$path != null : !this$path.equals(other$path)) return false;
            final Object this$avatar = this.getAvatar();
            final Object other$avatar = other.getAvatar();
            if (this$avatar == null ? other$avatar != null : !this$avatar.equals(other$avatar)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof DDPath;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $path = this.getPath();
            result = result * PRIME + ($path == null ? 43 : $path.hashCode());
            final Object $avatar = this.getAvatar();
            result = result * PRIME + ($avatar == null ? 43 : $avatar.hashCode());
            return result;
        }

        public String toString() {
            return "FileProperties.ElPath(path=" + this.getPath() + ", avatar=" + this.getAvatar() + ")";
        }
    }
}
