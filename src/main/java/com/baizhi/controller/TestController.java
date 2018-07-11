package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 惠 on 2018/7/4.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping("test")
    public String test(){
        System.out.println("asd");
        return "";
    }
}
