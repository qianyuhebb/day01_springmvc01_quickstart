package com.tc.domain;

import java.io.Serializable;

public class Account implements Serializable {

    private String username;
    private String password;
    private Double money;

    private userDO userDO;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public com.tc.domain.userDO getUserDO() {
        return userDO;
    }

    public void setUserDO(com.tc.domain.userDO userDO) {
        this.userDO = userDO;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", userDO=" + userDO +
                '}';
    }
}
