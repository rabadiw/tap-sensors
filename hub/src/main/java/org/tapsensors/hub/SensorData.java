package org.tapsensors.hub;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class SensorData {

    @Id
    private UUID id;
    private double temperature;
    private double pressure;

    public SensorData() {
    }

    public UUID getId() {
        return id;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }
}
