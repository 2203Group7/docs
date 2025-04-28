package com.pxx.ifmserver.controller;

import com.pxx.ifmserver.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public Result getUserInfo() {
        // 模拟用户数据
        return Result.ok().data("user", "这里是用户数据");
    }
}
