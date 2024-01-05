package com.owen.gateway.controller;

import com.owen.common.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("gateway")
public class MyController {

    @Value("${gateway.name}")
    private String name;

    @Value(("${gateway.age}"))
    private Integer age;

    public MyController() {
        System.out.println("hello myController");
    }


    @GetMapping("test")
    public R test() {

        return R.ok(name + age);
    }
}
