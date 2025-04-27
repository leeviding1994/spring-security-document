package com.dingli.spring_security_document.A_developingWithSpringBoot.web;

import com.dingli.spring_security_document.A_developingWithSpringBoot.A_configuration.NoAnnotationConfig;
import com.dingli.spring_security_document.A_developingWithSpringBoot.A_configuration.service.ConfigurationService;
import com.dingli.spring_security_document.A_developingWithSpringBoot.B_developerTools.DefaultPropertyComponent;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configuration")
@AllArgsConstructor
public class ConfigurationController {

    private final ConfigurationService configurationService;
    private final NoAnnotationConfig noAnnotationConfig;
    private final DefaultPropertyComponent defaultPropertyComponent;

    @GetMapping("/importSelector")
    public String list() {
        return configurationService.getConfiguration();
    }

    @GetMapping("/importTest")
    public String importTest() {
        return noAnnotationConfig.getName();
    }

    @GetMapping("/defaultPropertyComponent")
    public String DefaultPropertyComponent() {
        return defaultPropertyComponent.getIncludeMessage();
    }
}
