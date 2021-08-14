package com.sgrh.config;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:logging.props")
public class LoggerConfig {
	@Value("${root.logger.level}")
	private String rootLevelLogger;
	
	@Value("${printed.logger.level}")
	private String printedLevelLogger;
	
	@PostConstruct
	public void initLogger() {
		Level rootLevel = Level.parse(rootLevelLogger);
		Level printedLevel = Level.parse(printedLevelLogger);
		
		Logger applicationContextLogger = Logger.getLogger(LoggerConfig.class.getName());
		Logger parentLogger = applicationContextLogger.getParent();
		parentLogger.setLevel(rootLevel);
		
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(printedLevel);
		handler.setFormatter(new SimpleFormatter());
		
		parentLogger.addHandler(handler);
		
	}
}
