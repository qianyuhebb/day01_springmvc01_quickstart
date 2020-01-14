package com.tc.controller;


import com.tc.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        System.out.println("测试程序 hello springmvc");

        return  "success";
    }

    @RequestMapping("/hello2")
    public String hello2(String name){
        System.out.println(name+"=============");
        System.out.println("测试程序 hello springmvc");

        return  "success";
    }

    @RequestMapping("/hello3")
    public String hello3(Account account){

        System.out.println("测试程序 hello springmvc");
        System.out.println(account.toString());
        return  "success";
    }
}
