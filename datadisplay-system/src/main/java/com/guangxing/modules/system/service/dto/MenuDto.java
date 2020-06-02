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
package com.guangxing.modules.system.service.dto;

import com.guangxing.base.BaseDTO;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Guangxing
 * @date 2018-12-17
 */
public class MenuDto extends BaseDTO implements Serializable {

    private Long id;

    private List<MenuDto> children;

    private Integer type;

    private String permission;

    private String title;

    private Integer menuSort;

    private String path;

    private String component;

    private Long pid;

    private Boolean iFrame;

    private Boolean cache;

    private Boolean hidden;

    private String componentName;

    private String icon;

    private Boolean leaf = true;

    private Boolean hasChildren = false;

    public String getLabel() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MenuDto menuDto = (MenuDto) o;
        return Objects.equals(id, menuDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return this.id;
    }

    public List<MenuDto> getChildren() {
        return this.children;
    }

    public Integer getType() {
        return this.type;
    }

    public String getPermission() {
        return this.permission;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getMenuSort() {
        return this.menuSort;
    }

    public String getPath() {
        return this.path;
    }

    public String getComponent() {
        return this.component;
    }

    public Long getPid() {
        return this.pid;
    }

    public Boolean getIFrame() {
        return this.iFrame;
    }

    public Boolean getCache() {
        return this.cache;
    }

    public Boolean getHidden() {
        return this.hidden;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public String getIcon() {
        return this.icon;
    }

    public Boolean getLeaf() {
        return this.leaf;
    }

    public Boolean getHasChildren() {
        return this.hasChildren;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setChildren(List<MenuDto> children) {
        this.children = children;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setIFrame(Boolean iFrame) {
        this.iFrame = iFrame;
    }

    public void setCache(Boolean cache) {
        this.cache = cache;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}
