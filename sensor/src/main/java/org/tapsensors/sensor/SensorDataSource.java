package org.tapsensors.sensor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

@Component
public class SensorDataSource {

    private static final UUID SENSOR_ID = UUID.randomUUID();
    private final Logger log = LoggerFactory.getLogger(SensorDataSource.class);

    @Bean
    @Scheduled(fixedDelay = 5, timeUnit = TimeUnit.SECONDS)
    public Supplier<SensorData> sendSensorData() {
        return () -> {
            var sensorData = new SensorData(SENSOR_ID, generateTemperature(), generatePressure());
            log.info("Generated sensorData data: {}", sensorData);
            return sensorData;
        };
    }

    private double generateTemperature() {
        return Math.random() * 100;
    }

    private double generatePressure() {
        return Math.random() * 100;
    }
}
