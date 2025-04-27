package com.dingli.spring_security_document.A_developingWithSpringBoot.A_configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Slf4j
public class NoAnnotationConfig {
    private String name = "NoAnnotationConfig";

    public String getName(){
        log.debug("debug log: NoAnnotationConfig.getName");
        return name;
    }
}
