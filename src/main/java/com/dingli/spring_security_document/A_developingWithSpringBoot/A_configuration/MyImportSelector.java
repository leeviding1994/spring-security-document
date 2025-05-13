package com.dingli.spring_security_document.A_developingWithSpringBoot.A_configuration;

import com.dingli.spring_security_document.A_developingWithSpringBoot.A_configuration.service.impl.Configuration2ServiceImpl;
import com.dingli.spring_security_document.A_developingWithSpringBoot.A_configuration.service.impl.ConfigurationServiceImpl;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        if(envIsProd()) {
            return new String[] {ConfigurationServiceImpl.class.getName()};
        } else {
            return new String[] {Configuration2ServiceImpl.class.getName()};
        }
    }

    private boolean envIsProd() {
        return System.getenv().containsKey("PROD");
    }
}
