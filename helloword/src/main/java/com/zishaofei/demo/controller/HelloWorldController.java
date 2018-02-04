package com.zishaofei.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
@RestController

public class HelloWorldController {
    //    路由匹配
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
