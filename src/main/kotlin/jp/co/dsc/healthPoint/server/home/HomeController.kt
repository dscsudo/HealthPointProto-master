package jp.co.dsc.healthPoint.server.home

import jp.co.dsc.healthPoint.server.stepCounter.Step
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/home")
class HomeController {

    @GetMapping
    fun index(): Step {
        val step = Step()
        step.userId = 1
        step.step = 4193
        step.recordTimestamp = LocalDateTime.now()
        return step
    }
}
