package jp.co.dsc.healthPoint.server.stepCounter;

import jp.co.dsc.healthPoint.server.stepCounter.repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class StepCounterController {

    private final StepRepository stepRepository;

    public StepCounterController(StepRepository stepRepository){
        this.stepRepository = stepRepository;
    }

    @PostMapping(value = "step" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public Step readStepCount(@RequestBody Step step){
        stepRepository.insertSteps(step);
        return step;
    }
}
