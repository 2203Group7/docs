package com.pxx.ifmserver.controller;

import com.pxx.ifmserver.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReplyController {

    @GetMapping("/replies")
    public Result getAllReplies() {
        // 模拟回复数据
        return Result.ok().data("replies", "这里是回复数据");
    }
}
