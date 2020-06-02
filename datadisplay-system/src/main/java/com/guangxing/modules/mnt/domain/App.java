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
package com.guangxing.modules.mnt.domain;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import io.swagger.annotations.ApiModelProperty;
import com.guangxing.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Entity
@Table(name="mnt_app")
public class App extends BaseEntity implements Serializable {

    @Id
	@Column(name = "app_id")
	@ApiModelProperty(value = "ID", hidden = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@ApiModelProperty(value = "名称")
    private String name;

	@ApiModelProperty(value = "端口")
	private int port;

	@ApiModelProperty(value = "上传路径")
	private String uploadPath;

	@ApiModelProperty(value = "部署路径")
	private String deployPath;

	@ApiModelProperty(value = "备份路径")
	private String backupPath;

	@ApiModelProperty(value = "启动脚本")
	private String startScript;

	@ApiModelProperty(value = "部署脚本")
	private String deployScript;

    public void copy(App source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPort() {
        return this.port;
    }

    public String getUploadPath() {
        return this.uploadPath;
    }

    public String getDeployPath() {
        return this.deployPath;
    }

    public String getBackupPath() {
        return this.backupPath;
    }

    public String getStartScript() {
        return this.startScript;
    }

    public String getDeployScript() {
        return this.deployScript;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public void setDeployPath(String deployPath) {
        this.deployPath = deployPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
    }

    public void setStartScript(String startScript) {
        this.startScript = startScript;
    }

    public void setDeployScript(String deployScript) {
        this.deployScript = deployScript;
    }
}
