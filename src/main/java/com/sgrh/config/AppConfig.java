package com.sgrh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages= {"com.sgrh.component,com.sgrh.config"})
@Import(LoggerConfig.class)
public enum AppConfig {

}
