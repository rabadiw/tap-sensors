package org.tapsensors.hub.sensor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class SensorData {

    @Id
    private UUID id;
    private Integer temperature;
    private Integer pressure;

    public UUID getId() {
        return id;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "id=" + id +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                '}';
    }
}
