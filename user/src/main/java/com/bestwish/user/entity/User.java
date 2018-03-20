package com.bestwish.user.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity(name = "bestwish_user")
public class User extends BaseEntity {

    private String name;
    private String password;
    private String phone;
    private String wxOpenId;
    private BigDecimal amount;
    private BigDecimal giftAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(BigDecimal giftAmount) {
        this.giftAmount = giftAmount;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", wxOpenId='" + wxOpenId + '\'' +
                ", amount=" + amount +
                ", giftAmount=" + giftAmount +
                '}';
    }
}
