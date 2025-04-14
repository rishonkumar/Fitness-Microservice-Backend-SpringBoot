package com.fitnessaiservice.service;

/*
Goal we are trying to consume the data we are receving from activity service to Ai service
Check queues and stream this is the payload we received from activity service
{"id":"67fcac65a4ee6f70ec930c6a","userId":"d07bbff8-ab43-4c6e-b6f6-e8cfd34c1f98","type":"RUNNING","duration":45,"caloriesBurned":300,"startTime":[2025,4,7,7,30],"additionalMetrics":{"distanceInKm":5.2,"averagePace":"6:15/km","heartRate":130},"createdAt":[2025,4,14,12,4,13,586946600],"updatedAt":[2025,4,14,12,4,13,586946600]}

 */

import com.fitnessaiservice.model.Activity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ActivityMessageListener {

    @RabbitListener(queues = "activity.queue")
    public void  processActivity(Activity activity) {
        log.info("Received activity for processing : {} ", activity.getId()); // this will get the Id processed from activity check the above comments 67fcac65a4ee6f70ec930c6a
    }
}


