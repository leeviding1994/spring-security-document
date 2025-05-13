package com.dingli.spring_security_document.B_coreFeatures.A_springApplication.service;

public interface AvailabilityService {
    boolean livenessBroken();

    boolean livenessCorrect();
}
