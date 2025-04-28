package com.pxx.ifmserver.controller;

import com.pxx.ifmserver.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @GetMapping("/send-email")
    public Result sendEmail() {
        // 模拟邮件发送操作
        return Result.ok().data("message", "邮件已发送");
    }
}
