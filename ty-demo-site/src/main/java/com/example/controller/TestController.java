package com.example.controller;

import com.example.bean.Customer;
import com.example.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by guoguangnan on 16/10/14.
 */
@Controller
public class TestController {


    @Resource(name="CustomerService")
    private CustomerService customerService;

    @RequestMapping("test")
    public ModelAndView test(){
        ModelAndView mav = new ModelAndView("helloworld");
        List<Customer> list = customerService.selectList();

        if(!CollectionUtils.isEmpty(list)){
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i).getCustomerUsername());
            }

        }
        System.out.println("==============="+list);
        mav.addObject("list", list);
        return mav;
    }
}
