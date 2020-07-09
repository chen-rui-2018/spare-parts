package com.xj.spare.controller;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Date;

@RestController
public class Student implements Serializable {
    private  String id;
    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTme;
//    @JSONField(serialize = false)
    private  String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreateTme() {
        return createTme;
    }

    public void setCreateTme(Date createTme) {
        this.createTme = createTme;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
