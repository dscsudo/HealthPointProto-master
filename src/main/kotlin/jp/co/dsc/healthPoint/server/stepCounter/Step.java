package jp.co.dsc.healthPoint.server.stepCounter;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Step {

    private long userId;
    private int step;
    private LocalDateTime recordTimestamp;

    public long getUserId() {
        return userId;
    }

    public int getStep() {
        return step;
    }

    public LocalDateTime getRecordTimestamp() {
        return recordTimestamp;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void setRecordTimestamp(LocalDateTime recordTimestamp) {
        this.recordTimestamp = recordTimestamp;
    }
}
