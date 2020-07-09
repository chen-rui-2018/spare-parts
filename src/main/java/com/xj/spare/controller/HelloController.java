package com.xj.spare.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String   sayHello(){
        return "Hello Word chenrrui";
    }
    @RequestMapping("/hello2")
    public String   sayHello2(){
        return "Hello Word  2 chenrrui";
    }
    @RequestMapping("/hello3")
    public String   sayHello3(){
        return "Hello Word  3 chenrrui";
    }

    @RequestMapping(value="/getStudent", produces = "application/json; charset=utf-8")
    public Student getStudent(){
        Student student = new Student();
        student.setId("001");
        student.setName("张飞");
        student.setCreateTme(new Date());
        student.setDesc("这是描述信息...");
        return student;
    }

}
