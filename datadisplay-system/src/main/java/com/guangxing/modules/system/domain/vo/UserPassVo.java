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
package com.guangxing.modules.system.domain.vo;

/**
 * 修改密码的 Vo 类
 * @author Guangxing
 * @date 2019年7月11日13:59:49
 */
public class UserPassVo {

    private String oldPass;

    private String newPass;

    public UserPassVo() {
    }

    public String getOldPass() {
        return this.oldPass;
    }

    public String getNewPass() {
        return this.newPass;
    }

    public void setOldPass(String oldPass) {
        this.oldPass = oldPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserPassVo)) return false;
        final UserPassVo other = (UserPassVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$oldPass = this.getOldPass();
        final Object other$oldPass = other.getOldPass();
        if (this$oldPass == null ? other$oldPass != null : !this$oldPass.equals(other$oldPass)) return false;
        final Object this$newPass = this.getNewPass();
        final Object other$newPass = other.getNewPass();
        if (this$newPass == null ? other$newPass != null : !this$newPass.equals(other$newPass)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserPassVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $oldPass = this.getOldPass();
        result = result * PRIME + ($oldPass == null ? 43 : $oldPass.hashCode());
        final Object $newPass = this.getNewPass();
        result = result * PRIME + ($newPass == null ? 43 : $newPass.hashCode());
        return result;
    }

    public String toString() {
        return "UserPassVo(oldPass=" + this.getOldPass() + ", newPass=" + this.getNewPass() + ")";
    }
}
