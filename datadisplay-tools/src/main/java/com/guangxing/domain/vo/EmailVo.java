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

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 发送邮件时，接收参数的类
 * @author 郑杰
 * @date 2018/09/28 12:02:14
 */
public class EmailVo {

    /** 收件人，支持多个收件人 */
    @NotEmpty
    private List<String> tos;

    @NotBlank
    private String subject;

    @NotBlank
    private String content;

    public EmailVo(@NotEmpty List<String> tos, @NotBlank String subject, @NotBlank String content) {
        this.tos = tos;
        this.subject = subject;
        this.content = content;
    }

    public EmailVo() {
    }

    public @NotEmpty List<String> getTos() {
        return this.tos;
    }

    public @NotBlank String getSubject() {
        return this.subject;
    }

    public @NotBlank String getContent() {
        return this.content;
    }

    public void setTos(@NotEmpty List<String> tos) {
        this.tos = tos;
    }

    public void setSubject(@NotBlank String subject) {
        this.subject = subject;
    }

    public void setContent(@NotBlank String content) {
        this.content = content;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof EmailVo)) return false;
        final EmailVo other = (EmailVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tos = this.getTos();
        final Object other$tos = other.getTos();
        if (this$tos == null ? other$tos != null : !this$tos.equals(other$tos)) return false;
        final Object this$subject = this.getSubject();
        final Object other$subject = other.getSubject();
        if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof EmailVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tos = this.getTos();
        result = result * PRIME + ($tos == null ? 43 : $tos.hashCode());
        final Object $subject = this.getSubject();
        result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        return result;
    }

    public String toString() {
        return "EmailVo(tos=" + this.getTos() + ", subject=" + this.getSubject() + ", content=" + this.getContent() + ")";
    }
}
