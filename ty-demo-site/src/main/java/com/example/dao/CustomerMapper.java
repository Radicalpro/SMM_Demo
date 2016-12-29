package com.example.dao;


import com.example.bean.Customer;

import java.util.List;

/**
 * Created by guoguangnan on 16/10/14.
 */
public interface CustomerMapper {

    List<Customer> selectList();
}
