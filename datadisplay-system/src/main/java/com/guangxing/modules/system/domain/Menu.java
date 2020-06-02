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
package com.guangxing.modules.system.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import com.guangxing.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * @author Guangxing
 * @date 2018-12-17
 */
@Entity
@Table(name = "sys_menu")
public class Menu extends BaseEntity implements Serializable {

    @Id
    @Column(name = "menu_id")
    @NotNull(groups = {Update.class})
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToMany(mappedBy = "menus")
    @ApiModelProperty(value = "菜单角色")
    private Set<Role> roles;

    @ApiModelProperty(value = "菜单标题")
    private String title;

    @Column(name = "name")
    @ApiModelProperty(value = "菜单组件名称")
    private String componentName;

    @ApiModelProperty(value = "排序")
    private Integer menuSort = 999;

    @ApiModelProperty(value = "组件路径")
    private String component;

    @ApiModelProperty(value = "路由地址")
    private String path;

    @ApiModelProperty(value = "菜单类型，目录、菜单、按钮")
    private Integer type;

    @ApiModelProperty(value = "权限标识")
    private String permission;

    @ApiModelProperty(value = "菜单图标")
    private String icon;

    @Column(columnDefinition = "bit(1) default 0")
    @ApiModelProperty(value = "缓存")
    private Boolean cache;

    @Column(columnDefinition = "bit(1) default 0")
    @ApiModelProperty(value = "是否隐藏")
    private Boolean hidden;

    @ApiModelProperty(value = "上级菜单")
    private Long pid;

    @ApiModelProperty(value = "外链菜单")
    private Boolean iFrame;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Menu menu = (Menu) o;
        return Objects.equals(id, menu.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public @NotNull(groups = {Update.class}) Long getId() {
        return this.id;
    }

    public Set<Role> getRoles() {
        return this.roles;
    }

    public String getTitle() {
        return this.title;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public Integer getMenuSort() {
        return this.menuSort;
    }

    public String getComponent() {
        return this.component;
    }

    public String getPath() {
        return this.path;
    }

    public Integer getType() {
        return this.type;
    }

    public String getPermission() {
        return this.permission;
    }

    public String getIcon() {
        return this.icon;
    }

    public Boolean getCache() {
        return this.cache;
    }

    public Boolean getHidden() {
        return this.hidden;
    }

    public Long getPid() {
        return this.pid;
    }

    public Boolean getIFrame() {
        return this.iFrame;
    }

    public void setId(@NotNull(groups = {Update.class}) Long id) {
        this.id = id;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setCache(Boolean cache) {
        this.cache = cache;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setIFrame(Boolean iFrame) {
        this.iFrame = iFrame;
    }
}
