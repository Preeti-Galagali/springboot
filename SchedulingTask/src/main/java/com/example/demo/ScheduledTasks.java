package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

@Component
public class ScheduledTasks {

	   // TODO Auto-generated constructor stub
		
		private static final Logger log = (Logger) LoggerFactory.getLogger(ScheduledTasks.class);

		private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

		@Scheduled(fixedRate = 5000)
		public void reportCurrentTime() {
			log.info("The time is now {}", dateFormat.format(new Date()));
		}
	}


