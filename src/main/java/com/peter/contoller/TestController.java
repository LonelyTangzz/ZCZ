package com.peter.contoller;

import cn.hutool.core.bean.BeanUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        System.out.println("this is a test");
        return "Hello World";
    }
}
