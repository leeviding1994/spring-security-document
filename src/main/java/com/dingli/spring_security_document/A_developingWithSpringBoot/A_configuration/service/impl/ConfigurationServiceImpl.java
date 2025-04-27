package com.dingli.spring_security_document.A_developingWithSpringBoot.A_configuration.service.impl;

import com.dingli.spring_security_document.A_developingWithSpringBoot.A_configuration.service.ConfigurationService;

public class ConfigurationServiceImpl implements ConfigurationService {
    @Override
    public String getConfiguration() {
        return "ConfigurationServiceImpl";
    }
}
