package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 惠 on 2018/7/4.
 */
@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class Appplication {
    public static void main(String[] args) {
        SpringApplication.run(Appplication.class,args);
    }
}
