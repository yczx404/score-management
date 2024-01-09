package org.example.service.impl;

import org.example.entity.Score;
import org.example.repo.ScoreDAO;
import org.example.service.ScoreService;
import org.example.vo.Result;
import org.example.vo.StatisticResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    private static final  int MATH_SID = 2;
    @Autowired
    private ScoreDAO scoreDAO;

    @Override
    public Result<StatisticResult> getMathSummaryResult(int cid) {
        List<Score> scoreList = scoreDAO.findByCidAndSidOrderByScore(cid, MATH_SID);
        if(scoreList == null || scoreList.isEmpty()){
            return Result.failure("No student found with this cid");
        }

        // midian
        int size = scoreList.size();
        double medianScore = 0;
        if(size % 2 == 1){
            medianScore = scoreList.get((size-1)/2).getScore();
        }else {
            medianScore = (scoreList.get(size/2-1).getScore() + scoreList.get(size/2).getScore() + 0.0)/2;
        }

        // avg
        double avg = scoreList.stream().mapToLong(Score::getScore).average().getAsDouble();

        StatisticResult statisticResult = new StatisticResult();
        statisticResult.setCid(cid);
        statisticResult.setSid(MATH_SID);
        statisticResult.setAvg(String.format("%.2f",avg));
        statisticResult.setMidian(String.format("%.2f",medianScore));
        return Result.success(statisticResult);
    }
}
