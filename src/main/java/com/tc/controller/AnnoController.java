package com.tc.controller;

import com.tc.domain.userDO;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})   //将msg存到session域对象  用于方法之间参数的共享
public class AnnoController {


    @RequestMapping("testRquestParam")
    public  String testRquestParam(@RequestParam(name="name",required = true) String username){
        System.out.println(username);
        System.out.println("执行了");
        return "success";
    }

    @RequestMapping("testRquestBody")
    public  String testRquestBody(@RequestBody String body) {
        System.out.println(body);
        System.out.println("执行了");
        return "success";
    }

    @RequestMapping("testPathVariable/{sid}")
    public  String testPathVariable(@PathVariable(name="sid") String id) {
        System.out.println(id);
        System.out.println("执行了");
        return "success";
    }
    @RequestMapping("testRequestHeader")
    public  String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println(header);
        System.out.println("执行了");
        return "success";
    }
    @RequestMapping("testCookValue")
    public  String testCookValue(@CookieValue(value = "JSESSIONID") String cookvalue) {
        System.out.println(cookvalue);
        System.out.println("执行了");
        return "success";
    }



     @RequestMapping("testModelAttribute")
    public  String testModelAttribute(@ModelAttribute("abc") userDO userDO) {
         System.out.println(userDO.toString());
        System.out.println("testModelAttribute执行了");
        return "success";
    }

    @RequestMapping("testSessionAttribute")
    public  String testSessionAttribute(Model model) {
        model.addAttribute("msg","密码");
        System.out.println("testSessionAttribute");
        return "success";
    }
    @RequestMapping("getSessionAttribute")
    public  String getSessionAttribute(ModelMap model) {
         String d = (String) model.get("msg");
        System.out.println(d);
        System.out.println("getSessionAttribute");
        return "success";
    }

    /**
     * 此注解放在方法上，会优先执行此方法
     */
   /* @ModelAttribute
    public userDO show(userDO userDO){
        userDO.setName("张三");
        userDO.setAge(33);
        userDO.setDate(new Date());
        System.out.println("show 执行了");
        return userDO;
    } */
    @ModelAttribute
    public void show(userDO userDO, Map<String,userDO> map){
        userDO.setName("张三");
        userDO.setAge(33);
        userDO.setDate(new Date());
        System.out.println("show 执行了");
        map.put("abc",userDO);
    }
}