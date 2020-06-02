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
package com.guangxing.modules.system.domain.vo;

import java.io.Serializable;

/**
 * @author Guangxing
 * @date 2018-12-20
 */
public class MenuMetaVo implements Serializable {

    private String title;

    private String icon;

    private Boolean noCache;

    public MenuMetaVo(String title, String icon, Boolean noCache) {
        this.title = title;
        this.icon = icon;
        this.noCache = noCache;
    }

    public String getTitle() {
        return this.title;
    }

    public String getIcon() {
        return this.icon;
    }

    public Boolean getNoCache() {
        return this.noCache;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setNoCache(Boolean noCache) {
        this.noCache = noCache;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MenuMetaVo)) return false;
        final MenuMetaVo other = (MenuMetaVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$icon = this.getIcon();
        final Object other$icon = other.getIcon();
        if (this$icon == null ? other$icon != null : !this$icon.equals(other$icon)) return false;
        final Object this$noCache = this.getNoCache();
        final Object other$noCache = other.getNoCache();
        if (this$noCache == null ? other$noCache != null : !this$noCache.equals(other$noCache)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MenuMetaVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $icon = this.getIcon();
        result = result * PRIME + ($icon == null ? 43 : $icon.hashCode());
        final Object $noCache = this.getNoCache();
        result = result * PRIME + ($noCache == null ? 43 : $noCache.hashCode());
        return result;
    }

    public String toString() {
        return "MenuMetaVo(title=" + this.getTitle() + ", icon=" + this.getIcon() + ", noCache=" + this.getNoCache() + ")";
    }
}
