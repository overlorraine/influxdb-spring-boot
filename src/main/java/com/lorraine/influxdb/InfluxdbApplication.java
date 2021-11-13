package com.lorraine.influxdb;

import com.lorraine.influxdb.config.influx.InfluxDBClientProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableConfigurationProperties(InfluxDBClientProperties.class)
public class InfluxdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfluxdbApplication.class, args);
	}

}
