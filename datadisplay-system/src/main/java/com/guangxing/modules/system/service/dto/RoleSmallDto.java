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

import java.io.Serializable;

/**
 * @author Guangxing
 * @date 2018-11-23
 */
public class RoleSmallDto implements Serializable {

    private Long id;

    private String name;

    private Integer level;

    private String dataScope;

    public RoleSmallDto() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getDataScope() {
        return this.dataScope;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RoleSmallDto)) return false;
        final RoleSmallDto other = (RoleSmallDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$level = this.getLevel();
        final Object other$level = other.getLevel();
        if (this$level == null ? other$level != null : !this$level.equals(other$level)) return false;
        final Object this$dataScope = this.getDataScope();
        final Object other$dataScope = other.getDataScope();
        if (this$dataScope == null ? other$dataScope != null : !this$dataScope.equals(other$dataScope)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RoleSmallDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $level = this.getLevel();
        result = result * PRIME + ($level == null ? 43 : $level.hashCode());
        final Object $dataScope = this.getDataScope();
        result = result * PRIME + ($dataScope == null ? 43 : $dataScope.hashCode());
        return result;
    }

    public String toString() {
        return "RoleSmallDto(id=" + this.getId() + ", name=" + this.getName() + ", level=" + this.getLevel() + ", dataScope=" + this.getDataScope() + ")";
    }
}
