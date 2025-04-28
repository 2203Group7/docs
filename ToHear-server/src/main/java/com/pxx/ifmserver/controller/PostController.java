package com.pxx.ifmserver.controller;

import com.pxx.ifmserver.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/posts")
    public Result getAllPosts() {
        // 模拟帖子数据
        return Result.ok().data("posts", "这里是帖子数据");
    }
}
