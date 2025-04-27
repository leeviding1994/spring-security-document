package com.dingli.spring_security_document.A_developingWithSpringBoot.A_configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({NoAnnotationConfig.class, MyImportSelector.class})
public class ImportTest {

}