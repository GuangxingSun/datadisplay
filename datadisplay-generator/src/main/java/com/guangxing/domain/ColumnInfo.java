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
package com.guangxing.domain;

import com.guangxing.utils.GenUtil;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 列的数据信息
 * @author Guangxing
 * @date 2019-01-02
 */
@Entity
@Table(name = "code_column_config")
public class ColumnInfo implements Serializable {

    @Id
    @Column(name = "column_id")
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "表名")
    private String tableName;

    @ApiModelProperty(value = "数据库字段名称")
    private String columnName;

    @ApiModelProperty(value = "数据库字段类型")
    private String columnType;

    @ApiModelProperty(value = "数据库字段键类型")
    private String keyType;

    @ApiModelProperty(value = "字段额外的参数")
    private String extra;

    @ApiModelProperty(value = "数据库字段描述")
    private String remark;

    @ApiModelProperty(value = "是否必填")
    private Boolean notNull;

    @ApiModelProperty(value = "是否在列表显示")
    private Boolean listShow;

    @ApiModelProperty(value = "是否表单显示")
    private Boolean formShow;

    @ApiModelProperty(value = "表单类型")
    private String formType;

    @ApiModelProperty(value = "查询 1:模糊 2：精确")
    private String queryType;

    @ApiModelProperty(value = "字典名称")
    private String dictName;

    @ApiModelProperty(value = "日期注解")
    private String dateAnnotation;

    public ColumnInfo(String tableName, String columnName, Boolean notNull, String columnType, String remark, String keyType, String extra) {
        this.tableName = tableName;
        this.columnName = columnName;
        this.columnType = columnType;
        this.keyType = keyType;
        this.extra = extra;
        this.notNull = notNull;
        if(GenUtil.PK.equalsIgnoreCase(keyType) && GenUtil.EXTRA.equalsIgnoreCase(extra)){
            this.notNull = false;
        }
        this.remark = remark;
        this.listShow = true;
        this.formShow = true;
    }

    public ColumnInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public String getColumnType() {
        return this.columnType;
    }

    public String getKeyType() {
        return this.keyType;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getRemark() {
        return this.remark;
    }

    public Boolean getNotNull() {
        return this.notNull;
    }

    public Boolean getListShow() {
        return this.listShow;
    }

    public Boolean getFormShow() {
        return this.formShow;
    }

    public String getFormType() {
        return this.formType;
    }

    public String getQueryType() {
        return this.queryType;
    }

    public String getDictName() {
        return this.dictName;
    }

    public String getDateAnnotation() {
        return this.dateAnnotation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    public void setListShow(Boolean listShow) {
        this.listShow = listShow;
    }

    public void setFormShow(Boolean formShow) {
        this.formShow = formShow;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public void setDateAnnotation(String dateAnnotation) {
        this.dateAnnotation = dateAnnotation;
    }
}
