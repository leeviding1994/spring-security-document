package com.dingli.spring_security_document.B_coreFeatures.A_springApplication.service.impl;

import com.dingli.spring_security_document.B_coreFeatures.A_springApplication.MyEventPublisher;
import com.dingli.spring_security_document.B_coreFeatures.A_springApplication.service.AvailabilityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AvailabilityServiceImpl implements AvailabilityService {

    private final MyEventPublisher myEventPublisher;

    @Override
    public boolean livenessCorrect() {
        return myEventPublisher.publishLivenessCorrectEvent();
    }

    @Override
    public boolean livenessBroken() {
        return myEventPublisher.publishLivenessBrokenEvent();
    }
}
