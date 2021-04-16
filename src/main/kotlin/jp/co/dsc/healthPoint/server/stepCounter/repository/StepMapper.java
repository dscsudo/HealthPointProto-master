package jp.co.dsc.healthPoint.server.stepCounter.repository;

import jp.co.dsc.healthPoint.server.stepCounter.Step;

@org.apache.ibatis.annotations.Mapper
public interface StepMapper {

    void insertSteps(Step step);
}
