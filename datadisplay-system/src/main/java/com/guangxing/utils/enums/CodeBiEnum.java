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
package com.guangxing.utils.enums;

/**
 * <p>
 * 验证码业务场景
 * </p>
 * @author Guangxing
 * @date 2020-05-02
 */
public enum CodeBiEnum {

    /* 旧邮箱修改邮箱 */
    ONE(1, "旧邮箱修改邮箱"),

    /* 通过邮箱修改密码 */
    TWO(1, "通过邮箱修改密码");

    private final Integer code;
    private final String description;

    private CodeBiEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public static CodeBiEnum find(Integer code) {
        for (CodeBiEnum value : CodeBiEnum.values()) {
            if (code.equals(value.getCode())) {
                return value;
            }
        }
        return null;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}
