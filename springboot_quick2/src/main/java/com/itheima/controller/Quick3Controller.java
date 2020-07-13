package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;

@RestController
@ConfigurationProperties(prefix = "person")
public class Quick3Controller {


//    @Email 后端规定格式
    private String name;
    private String addr;

    @RequestMapping("/quick4")
    public String quick2(){
        //获得配置文件的信息

        return  "name:"+name+",addr:"+addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
