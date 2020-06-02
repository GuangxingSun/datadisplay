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
package com.guangxing.service.dto;

import com.guangxing.annotation.Query;

import java.sql.Timestamp;
import java.util.List;

/**
 * sm.ms图床
 *
 * @author Guangxing
 * @date 2019-6-4 09:52:09
 */
public class PictureQueryCriteria{

    @Query(type = Query.Type.INNER_LIKE)
    private String filename;
    
    @Query(type = Query.Type.INNER_LIKE)
    private String username;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;

    public PictureQueryCriteria() {
    }

    public String getFilename() {
        return this.filename;
    }

    public String getUsername() {
        return this.username;
    }

    public List<Timestamp> getCreateTime() {
        return this.createTime;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCreateTime(List<Timestamp> createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PictureQueryCriteria)) return false;
        final PictureQueryCriteria other = (PictureQueryCriteria) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$filename = this.getFilename();
        final Object other$filename = other.getFilename();
        if (this$filename == null ? other$filename != null : !this$filename.equals(other$filename)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PictureQueryCriteria;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $filename = this.getFilename();
        result = result * PRIME + ($filename == null ? 43 : $filename.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "PictureQueryCriteria(filename=" + this.getFilename() + ", username=" + this.getUsername() + ", createTime=" + this.getCreateTime() + ")";
    }
}
