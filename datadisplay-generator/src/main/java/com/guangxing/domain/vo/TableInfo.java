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
package com.guangxing.domain.vo;

/**
 * 表的数据信息
 * @author Guangxing
 * @date 2019-01-02
 */
public class TableInfo {

    /** 表名称 */
    private Object tableName;

    /** 创建日期 */
    private Object createTime;

    /** 数据库引擎 */
    private Object engine;

    /** 编码集 */
    private Object coding;

    /** 备注 */
    private Object remark;


    public TableInfo(Object tableName, Object createTime, Object engine, Object coding, Object remark) {
        this.tableName = tableName;
        this.createTime = createTime;
        this.engine = engine;
        this.coding = coding;
        this.remark = remark;
    }

    public TableInfo() {
    }

    public Object getTableName() {
        return this.tableName;
    }

    public Object getCreateTime() {
        return this.createTime;
    }

    public Object getEngine() {
        return this.engine;
    }

    public Object getCoding() {
        return this.coding;
    }

    public Object getRemark() {
        return this.remark;
    }

    public void setTableName(Object tableName) {
        this.tableName = tableName;
    }

    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    public void setEngine(Object engine) {
        this.engine = engine;
    }

    public void setCoding(Object coding) {
        this.coding = coding;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TableInfo)) return false;
        final TableInfo other = (TableInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tableName = this.getTableName();
        final Object other$tableName = other.getTableName();
        if (this$tableName == null ? other$tableName != null : !this$tableName.equals(other$tableName)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$engine = this.getEngine();
        final Object other$engine = other.getEngine();
        if (this$engine == null ? other$engine != null : !this$engine.equals(other$engine)) return false;
        final Object this$coding = this.getCoding();
        final Object other$coding = other.getCoding();
        if (this$coding == null ? other$coding != null : !this$coding.equals(other$coding)) return false;
        final Object this$remark = this.getRemark();
        final Object other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !this$remark.equals(other$remark)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TableInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tableName = this.getTableName();
        result = result * PRIME + ($tableName == null ? 43 : $tableName.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $engine = this.getEngine();
        result = result * PRIME + ($engine == null ? 43 : $engine.hashCode());
        final Object $coding = this.getCoding();
        result = result * PRIME + ($coding == null ? 43 : $coding.hashCode());
        final Object $remark = this.getRemark();
        result = result * PRIME + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }

    public String toString() {
        return "TableInfo(tableName=" + this.getTableName() + ", createTime=" + this.getCreateTime() + ", engine=" + this.getEngine() + ", coding=" + this.getCoding() + ", remark=" + this.getRemark() + ")";
    }
}
