package com.gkatzioura;

import com.gkatzioura.service.CheckAsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by gkatzioura on 4/26/17.
 */
@Component
public class Scheduler {

    @Autowired
    private CheckAsyncService checkAsyncService;

    @Scheduled(fixedDelay = 10000)
    public void checkTheScedule() {
        fetchEm();
    }

    @Async
    public void fetchEm() {
        checkAsyncService.checkAQuery();
    }

}
