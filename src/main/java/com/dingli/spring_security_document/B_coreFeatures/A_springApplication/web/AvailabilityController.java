package com.dingli.spring_security_document.B_coreFeatures.A_springApplication.web;

import com.dingli.spring_security_document.B_coreFeatures.A_springApplication.service.AvailabilityService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/availability")
@Data
@AllArgsConstructor
public class AvailabilityController {

    private final AvailabilityService availabilityService;

    @RequestMapping("/livenessBroken")
    public boolean livenessBroken() {
        return availabilityService.livenessBroken();
    }

    @RequestMapping("/livenessCorrect")
    public boolean livenessCorrect() {
        return availabilityService.livenessCorrect();
    }

}
