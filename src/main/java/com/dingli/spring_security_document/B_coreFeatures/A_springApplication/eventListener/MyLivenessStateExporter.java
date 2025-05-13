package com.dingli.spring_security_document.B_coreFeatures.A_springApplication.eventListener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyLivenessStateExporter {

    @EventListener
    public void onStateChange(AvailabilityChangeEvent<LivenessState> event) {
        switch (event.getState()) {
            case CORRECT -> {
                // create file /tmp/healthy
                log.info("LIVENESS-CORRECT");
            }
            case BROKEN -> {
                // remove file /tmp/healthy
                log.info("LIVENESS-BROKEN");
            }
        }
    }

}