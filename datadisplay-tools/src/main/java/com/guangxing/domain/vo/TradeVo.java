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

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * 交易详情，按需应该存入数据库，这里存入数据库，仅供临时测试
 * @author Guangxing
 * @date 2018-12-31
 */
public class TradeVo {

    /** （必填）商品描述 */
    @NotBlank
    private String body;

    /** （必填）商品名称 */
    @NotBlank
    private String subject;

    /** （必填）商户订单号，应该由后台生成 */
    @ApiModelProperty(hidden = true)
    private String outTradeNo;

    /** （必填）第三方订单号 */
    @ApiModelProperty(hidden = true)
    private String tradeNo;

    /** （必填）价格 */
    @NotBlank
    private String totalAmount;

    /** 订单状态,已支付，未支付，作废 */
    @ApiModelProperty(hidden = true)
    private String state;

    /** 创建时间，存入数据库时需要 */
    @ApiModelProperty(hidden = true)
    private Timestamp createTime;

    /** 作废时间，存入数据库时需要 */
    @ApiModelProperty(hidden = true)
    private Date cancelTime;

    public TradeVo() {
    }

    public @NotBlank String getBody() {
        return this.body;
    }

    public @NotBlank String getSubject() {
        return this.subject;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public @NotBlank String getTotalAmount() {
        return this.totalAmount;
    }

    public String getState() {
        return this.state;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public Date getCancelTime() {
        return this.cancelTime;
    }

    public void setBody(@NotBlank String body) {
        this.body = body;
    }

    public void setSubject(@NotBlank String subject) {
        this.subject = subject;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public void setTotalAmount(@NotBlank String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TradeVo)) return false;
        final TradeVo other = (TradeVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$body = this.getBody();
        final Object other$body = other.getBody();
        if (this$body == null ? other$body != null : !this$body.equals(other$body)) return false;
        final Object this$subject = this.getSubject();
        final Object other$subject = other.getSubject();
        if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject)) return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (this$outTradeNo == null ? other$outTradeNo != null : !this$outTradeNo.equals(other$outTradeNo))
            return false;
        final Object this$tradeNo = this.getTradeNo();
        final Object other$tradeNo = other.getTradeNo();
        if (this$tradeNo == null ? other$tradeNo != null : !this$tradeNo.equals(other$tradeNo)) return false;
        final Object this$totalAmount = this.getTotalAmount();
        final Object other$totalAmount = other.getTotalAmount();
        if (this$totalAmount == null ? other$totalAmount != null : !this$totalAmount.equals(other$totalAmount))
            return false;
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$cancelTime = this.getCancelTime();
        final Object other$cancelTime = other.getCancelTime();
        if (this$cancelTime == null ? other$cancelTime != null : !this$cancelTime.equals(other$cancelTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TradeVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $body = this.getBody();
        result = result * PRIME + ($body == null ? 43 : $body.hashCode());
        final Object $subject = this.getSubject();
        result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $tradeNo = this.getTradeNo();
        result = result * PRIME + ($tradeNo == null ? 43 : $tradeNo.hashCode());
        final Object $totalAmount = this.getTotalAmount();
        result = result * PRIME + ($totalAmount == null ? 43 : $totalAmount.hashCode());
        final Object $state = this.getState();
        result = result * PRIME + ($state == null ? 43 : $state.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $cancelTime = this.getCancelTime();
        result = result * PRIME + ($cancelTime == null ? 43 : $cancelTime.hashCode());
        return result;
    }

    public String toString() {
        return "TradeVo(body=" + this.getBody() + ", subject=" + this.getSubject() + ", outTradeNo=" + this.getOutTradeNo() + ", tradeNo=" + this.getTradeNo() + ", totalAmount=" + this.getTotalAmount() + ", state=" + this.getState() + ", createTime=" + this.getCreateTime() + ", cancelTime=" + this.getCancelTime() + ")";
    }
}
