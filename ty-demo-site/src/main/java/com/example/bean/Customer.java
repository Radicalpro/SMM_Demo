package com.example.bean;

import java.util.Date;

/**
 * 表实体类
 * Created by guoguangnan on 16/10/14.
 */
public class Customer {


    private Long customerId;


    private String customerUsername;


    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }


}
