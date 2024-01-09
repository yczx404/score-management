package org.example.controller;

import org.example.service.ScoreService;
import org.example.vo.Result;
import org.example.vo.StatisticResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PostMapping("/statistic")
    public Result<StatisticResult> statistic(int cid) {
        return service.getMathSummaryResult(cid);
    }
}
