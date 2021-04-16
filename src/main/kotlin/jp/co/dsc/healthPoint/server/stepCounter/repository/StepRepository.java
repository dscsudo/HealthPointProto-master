package jp.co.dsc.healthPoint.server.stepCounter.repository;

import jp.co.dsc.healthPoint.server.stepCounter.Step;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Repository
public class StepRepository {

    private final StepMapper stepMapper;

    public StepRepository(StepMapper stepMapper){
        this.stepMapper = stepMapper;
    }

    //DBに歩数を登録するメソッド
    public void insertSteps(Step step){
        stepMapper.insertSteps(step);
    }
}
