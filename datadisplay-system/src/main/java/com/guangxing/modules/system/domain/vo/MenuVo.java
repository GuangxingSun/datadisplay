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

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

/**
 * 构建前端路由时用到
 * @author Guangxing
 * @date 2018-12-20
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MenuVo implements Serializable {

    private String name;

    private String path;

    private Boolean hidden;

    private String redirect;

    private String component;

    private Boolean alwaysShow;

    private MenuMetaVo meta;

    private List<MenuVo> children;

    public MenuVo() {
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public Boolean getHidden() {
        return this.hidden;
    }

    public String getRedirect() {
        return this.redirect;
    }

    public String getComponent() {
        return this.component;
    }

    public Boolean getAlwaysShow() {
        return this.alwaysShow;
    }

    public MenuMetaVo getMeta() {
        return this.meta;
    }

    public List<MenuVo> getChildren() {
        return this.children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public void setAlwaysShow(Boolean alwaysShow) {
        this.alwaysShow = alwaysShow;
    }

    public void setMeta(MenuMetaVo meta) {
        this.meta = meta;
    }

    public void setChildren(List<MenuVo> children) {
        this.children = children;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MenuVo)) return false;
        final MenuVo other = (MenuVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$path = this.getPath();
        final Object other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) return false;
        final Object this$hidden = this.getHidden();
        final Object other$hidden = other.getHidden();
        if (this$hidden == null ? other$hidden != null : !this$hidden.equals(other$hidden)) return false;
        final Object this$redirect = this.getRedirect();
        final Object other$redirect = other.getRedirect();
        if (this$redirect == null ? other$redirect != null : !this$redirect.equals(other$redirect)) return false;
        final Object this$component = this.getComponent();
        final Object other$component = other.getComponent();
        if (this$component == null ? other$component != null : !this$component.equals(other$component)) return false;
        final Object this$alwaysShow = this.getAlwaysShow();
        final Object other$alwaysShow = other.getAlwaysShow();
        if (this$alwaysShow == null ? other$alwaysShow != null : !this$alwaysShow.equals(other$alwaysShow))
            return false;
        final Object this$meta = this.getMeta();
        final Object other$meta = other.getMeta();
        if (this$meta == null ? other$meta != null : !this$meta.equals(other$meta)) return false;
        final Object this$children = this.getChildren();
        final Object other$children = other.getChildren();
        if (this$children == null ? other$children != null : !this$children.equals(other$children)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MenuVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $path = this.getPath();
        result = result * PRIME + ($path == null ? 43 : $path.hashCode());
        final Object $hidden = this.getHidden();
        result = result * PRIME + ($hidden == null ? 43 : $hidden.hashCode());
        final Object $redirect = this.getRedirect();
        result = result * PRIME + ($redirect == null ? 43 : $redirect.hashCode());
        final Object $component = this.getComponent();
        result = result * PRIME + ($component == null ? 43 : $component.hashCode());
        final Object $alwaysShow = this.getAlwaysShow();
        result = result * PRIME + ($alwaysShow == null ? 43 : $alwaysShow.hashCode());
        final Object $meta = this.getMeta();
        result = result * PRIME + ($meta == null ? 43 : $meta.hashCode());
        final Object $children = this.getChildren();
        result = result * PRIME + ($children == null ? 43 : $children.hashCode());
        return result;
    }

    public String toString() {
        return "MenuVo(name=" + this.getName() + ", path=" + this.getPath() + ", hidden=" + this.getHidden() + ", redirect=" + this.getRedirect() + ", component=" + this.getComponent() + ", alwaysShow=" + this.getAlwaysShow() + ", meta=" + this.getMeta() + ", children=" + this.getChildren() + ")";
    }
}
