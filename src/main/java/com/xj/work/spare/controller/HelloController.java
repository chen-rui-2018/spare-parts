package com.xj.work.spare.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@Api(tags = "测试")
@RestController
public class HelloController {


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String   sayHello(){
        return "Hello Word chenrrui";
    }
    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String   sayHello2(){
        return "Hello Word  2 chenrrui";
    }
    @RequestMapping(value = "/hello3",method = RequestMethod.GET)
    public String   sayHello3(){
        return "Hello Word  3 chenrrui";
    }
    @ApiOperation(value = "测试", notes = "swagger2测试")
    @RequestMapping(value="/getStudent", produces = "application/json; charset=utf-8",method = RequestMethod.GET)
    public Student getStudent(){
        Student student = new Student();
        student.setId("001");
        student.setName("张飞");
        student.setCreateTme(new Date());
        student.setDesc("这是描述信息...");
        return student;
    }

}
