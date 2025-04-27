package com.dingli.spring_security_document.A_developingWithSpringBoot.B_developerTools;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DefaultPropertyComponent {

    @Value("${server.error.include-message:none}")
    private String includeMessage;

    public String getIncludeMessage() {
        log.debug("debug log: DefaultPropertyComponent.getIncludeMessage");
        return includeMessage;
    }
}
