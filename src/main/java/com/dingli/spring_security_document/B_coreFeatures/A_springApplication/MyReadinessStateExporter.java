package com.dingli.spring_security_document.B_coreFeatures.A_springApplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyReadinessStateExporter {

    @EventListener
    public void onStateChange(AvailabilityChangeEvent<ReadinessState> event) {
        switch (event.getState()) {
            case ACCEPTING_TRAFFIC -> {
                // create file /tmp/healthy
                log.info("ACCEPTING_TRAFFIC");
            }
            case REFUSING_TRAFFIC -> {
                // remove file /tmp/healthy
                log.info("REFUSING_TRAFFIC");
            }
        }
    }

}