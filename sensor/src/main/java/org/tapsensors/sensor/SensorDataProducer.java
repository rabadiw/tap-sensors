package org.tapsensors.sensor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

@Configuration
public class SensorDataProducer {

    private final UUID sensorId = UUID.randomUUID();
    private final Random random = new Random();
    private final Logger log = LoggerFactory.getLogger(SensorDataProducer.class);

    @Bean
    public Supplier<SensorData> generateSensorData() {
        return () -> {
            var sensorData = new SensorData(sensorId, generateTemperature(), generatePressure());
            log.info("Generated sensor data: {}", sensorData);
            return sensorData;
        };
    }

    private int generateTemperature() {
        return random.nextInt(130) - 30;
    }

    private int generatePressure() {
        return random.nextInt(100) + 950;
    }
}
