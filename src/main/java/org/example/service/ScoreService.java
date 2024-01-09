package org.example.service;

import org.example.vo.Result;
import org.example.vo.StatisticResult;

public interface ScoreService {

    public Result<StatisticResult> getMathSummaryResult(int cid);
}
