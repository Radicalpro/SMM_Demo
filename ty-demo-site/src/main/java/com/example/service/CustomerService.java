package com.example.service;

import com.example.bean.Customer;
import com.example.dao.CustomerMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by guoguangnan on 16/10/14.
 */
@Service("CustomerService")
public class CustomerService {

    @Resource(name = "CustomerMapper")
    private CustomerMapper customerMapper;

    @Transactional(readOnly = true, timeout = 10)
    public List<Customer> selectList() {
        return customerMapper.selectList();
    }
}
