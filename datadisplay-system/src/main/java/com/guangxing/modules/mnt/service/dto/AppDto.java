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
package com.guangxing.modules.mnt.service.dto;

import com.guangxing.base.BaseDTO;

import java.io.Serializable;

/**
* @author guangxing
* @date 2019-08-24
*/
public class AppDto extends BaseDTO implements Serializable {

	/**
	 * 应用编号
	 */
    private Long id;

	/**
	 * 应用名称
	 */
	private String name;

	/**
	 * 端口
	 */
	private Integer port;

	/**
	 * 上传目录
	 */
	private String uploadPath;

	/**
	 * 部署目录
	 */
	private String deployPath;

	/**
	 * 备份目录
	 */
	private String backupPath;

	/**
	 * 启动脚本
	 */
	private String startScript;

	/**
	 * 部署脚本
	 */
	private String deployScript;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPort() {
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

    public void setPort(Integer port) {
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
