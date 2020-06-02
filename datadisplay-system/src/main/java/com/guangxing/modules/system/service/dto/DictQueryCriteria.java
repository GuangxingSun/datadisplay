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
 * 公共查询类
 */
public class DictQueryCriteria {

    @Query(blurry = "name,remark")
    private String blurry;

    public DictQueryCriteria() {
    }

    public String getBlurry() {
        return this.blurry;
    }

    public void setBlurry(String blurry) {
        this.blurry = blurry;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DictQueryCriteria)) return false;
        final DictQueryCriteria other = (DictQueryCriteria) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$blurry = this.getBlurry();
        final Object other$blurry = other.getBlurry();
        if (this$blurry == null ? other$blurry != null : !this$blurry.equals(other$blurry)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DictQueryCriteria;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $blurry = this.getBlurry();
        result = result * PRIME + ($blurry == null ? 43 : $blurry.hashCode());
        return result;
    }

    public String toString() {
        return "DictQueryCriteria(blurry=" + this.getBlurry() + ")";
    }
}
