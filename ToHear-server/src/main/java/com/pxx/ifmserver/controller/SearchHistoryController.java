package com.pxx.ifmserver.controller;

import com.pxx.ifmserver.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchHistoryController {

    @GetMapping("/search-history")
    public Result getSearchHistory() {
        // 模拟搜索历史数据
        return Result.ok().data("searchHistory", "这里是搜索历史数据");
    }
}
