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

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 代码生成配置
 * @author Guangxing
 * @date 2019-01-03
 */
@Entity
@Table(name = "code_gen_config")
public class GenConfig implements Serializable {

    public GenConfig(String tableName) {
        this.tableName = tableName;
    }

    @Id
    @Column(name = "config_id")
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @ApiModelProperty(value = "表名")
    private String tableName;

    @ApiModelProperty(value = "接口名称")
    private String apiAlias;

    @NotBlank
    @ApiModelProperty(value = "包路径")
    private String pack;

    @NotBlank
    @ApiModelProperty(value = "模块名")
    private String moduleName;

    @NotBlank
    @ApiModelProperty(value = "前端文件路径")
    private String path;

    @ApiModelProperty(value = "前端文件路径")
    private String apiPath;

    @ApiModelProperty(value = "作者")
    private String author;

    @ApiModelProperty(value = "表前缀")
    private String prefix;

    @ApiModelProperty(value = "是否覆盖")
    private Boolean cover = false;

    public GenConfig() {
    }

    public Long getId() {
        return this.id;
    }

    public @NotBlank String getTableName() {
        return this.tableName;
    }

    public String getApiAlias() {
        return this.apiAlias;
    }

    public @NotBlank String getPack() {
        return this.pack;
    }

    public @NotBlank String getModuleName() {
        return this.moduleName;
    }

    public @NotBlank String getPath() {
        return this.path;
    }

    public String getApiPath() {
        return this.apiPath;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public Boolean getCover() {
        return this.cover;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTableName(@NotBlank String tableName) {
        this.tableName = tableName;
    }

    public void setApiAlias(String apiAlias) {
        this.apiAlias = apiAlias;
    }

    public void setPack(@NotBlank String pack) {
        this.pack = pack;
    }

    public void setModuleName(@NotBlank String moduleName) {
        this.moduleName = moduleName;
    }

    public void setPath(@NotBlank String path) {
        this.path = path;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setCover(Boolean cover) {
        this.cover = cover;
    }
}
