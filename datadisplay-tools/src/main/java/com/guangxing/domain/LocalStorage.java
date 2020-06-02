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

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.guangxing.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
* @author Guangxing
* @date 2019-09-05
*/
@Entity
@Table(name="tool_local_storage")
public class LocalStorage extends BaseEntity implements Serializable {

    @Id
    @Column(name = "storage_id")
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "真实文件名")
    private String realName;

    @ApiModelProperty(value = "文件名")
    private String name;

    @ApiModelProperty(value = "后缀")
    private String suffix;

    @ApiModelProperty(value = "路径")
    private String path;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "大小")
    private String size;

    public LocalStorage(String realName,String name, String suffix, String path, String type, String size) {
        this.realName = realName;
        this.name = name;
        this.suffix = suffix;
        this.path = path;
        this.type = type;
        this.size = size;
    }

    public LocalStorage() {
    }

    public void copy(LocalStorage source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }

    public Long getId() {
        return this.id;
    }

    public String getRealName() {
        return this.realName;
    }

    public String getName() {
        return this.name;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public String getPath() {
        return this.path;
    }

    public String getType() {
        return this.type;
    }

    public String getSize() {
        return this.size;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }
}