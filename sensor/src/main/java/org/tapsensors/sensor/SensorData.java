package org.tapsensors.sensor;

import java.util.UUID;

public class SensorData {

    private final UUID id;
    private final double temperature;
    private final double pressure;

    public SensorData(UUID id, double temperature, double pressure) {
        this.id = id;
        this.temperature = temperature;
        this.pressure = pressure;
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
