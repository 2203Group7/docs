package com.pxx.ifmserver.controller;

import com.pxx.ifmserver.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController {

    @GetMapping("/channels")
    public Result getAllChannels() {
        // 模拟频道数据
        return Result.ok().data("channels", "这里是频道数据");
    }
}
