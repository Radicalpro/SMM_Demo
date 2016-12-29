package com.example.dao.impl;


import com.example.base.BasicSqlSupport;
import com.example.bean.Customer;
import com.example.dao.CustomerMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by guoguangnan on 16/10/14.
 */
@Repository("CustomerMapper")
public class CustomerMapperImpl extends BasicSqlSupport implements CustomerMapper {


    public List<Customer> selectList() {
        return this.selectList("com.example.dao.CustomerMapper.selectList");
    }
}
