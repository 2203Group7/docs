package com.pxx.ifmserver.controller;

import com.pxx.ifmserver.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @GetMapping("/comments")
    public Result getAllComments() {
        // 模拟评论数据
        return Result.ok().data("comments", "这里是评论数据");
    }
}
