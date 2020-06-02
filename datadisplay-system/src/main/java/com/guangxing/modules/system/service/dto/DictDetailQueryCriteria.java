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

import com.guangxing.annotation.Query;

/**
* @author Guangxing
* @date 2019-04-10
*/
public class DictDetailQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String label;

    @Query(propName = "name",joinName = "dict")
    private String dictName;

    public DictDetailQueryCriteria() {
    }

    public String getLabel() {
        return this.label;
    }

    public String getDictName() {
        return this.dictName;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DictDetailQueryCriteria)) return false;
        final DictDetailQueryCriteria other = (DictDetailQueryCriteria) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$label = this.getLabel();
        final Object other$label = other.getLabel();
        if (this$label == null ? other$label != null : !this$label.equals(other$label)) return false;
        final Object this$dictName = this.getDictName();
        final Object other$dictName = other.getDictName();
        if (this$dictName == null ? other$dictName != null : !this$dictName.equals(other$dictName)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DictDetailQueryCriteria;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $label = this.getLabel();
        result = result * PRIME + ($label == null ? 43 : $label.hashCode());
        final Object $dictName = this.getDictName();
        result = result * PRIME + ($dictName == null ? 43 : $dictName.hashCode());
        return result;
    }

    public String toString() {
        return "DictDetailQueryCriteria(label=" + this.getLabel() + ", dictName=" + this.getDictName() + ")";
    }
}