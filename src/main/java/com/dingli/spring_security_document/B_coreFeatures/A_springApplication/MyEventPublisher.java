package com.dingli.spring_security_document.B_coreFeatures.A_springApplication;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class MyEventPublisher {

    private final ApplicationEventPublisher eventPublisher;

    public boolean publishLivenessBrokenEvent() {
        try {
            AvailabilityChangeEvent.publish(this.eventPublisher, "",  LivenessState.BROKEN);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean publishLivenessCorrectEvent() {
        try {
            AvailabilityChangeEvent.publish(this.eventPublisher, "",  LivenessState.CORRECT);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
