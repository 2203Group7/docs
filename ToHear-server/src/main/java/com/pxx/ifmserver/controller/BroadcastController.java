package com.pxx.ifmserver.controller;

import com.pxx.ifmserver.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BroadcastController {

    @GetMapping("/broadcasts")
    public Result getAllBroadcasts() {
        // 模拟广播数据
        return Result.ok().data("broadcasts", "这里是广播数据");
    }

    @GetMapping("/broadcast/{id}")
    public Result getBroadcastById() {
        // 模拟返回特定广播数据
        return Result.ok().data("broadcast", "这里是特定广播数据");
    }
}
