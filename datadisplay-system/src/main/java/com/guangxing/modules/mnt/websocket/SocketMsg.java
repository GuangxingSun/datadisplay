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
package com.guangxing.modules.mnt.websocket;

/**
 * @author guangxing
 * @date 2019-08-10 9:55
 */
public class SocketMsg {
	private String msg;
	private MsgType msgType;

	public SocketMsg(String msg, MsgType msgType) {
		this.msg = msg;
		this.msgType = msgType;
	}

    public SocketMsg() {
    }

    public String getMsg() {
        return this.msg;
    }

    public MsgType getMsgType() {
        return this.msgType;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setMsgType(MsgType msgType) {
        this.msgType = msgType;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SocketMsg)) return false;
        final SocketMsg other = (SocketMsg) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$msg = this.getMsg();
        final Object other$msg = other.getMsg();
        if (this$msg == null ? other$msg != null : !this$msg.equals(other$msg)) return false;
        final Object this$msgType = this.getMsgType();
        final Object other$msgType = other.getMsgType();
        if (this$msgType == null ? other$msgType != null : !this$msgType.equals(other$msgType)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SocketMsg;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $msg = this.getMsg();
        result = result * PRIME + ($msg == null ? 43 : $msg.hashCode());
        final Object $msgType = this.getMsgType();
        result = result * PRIME + ($msgType == null ? 43 : $msgType.hashCode());
        return result;
    }

    public String toString() {
        return "SocketMsg(msg=" + this.getMsg() + ", msgType=" + this.getMsgType() + ")";
    }
}
