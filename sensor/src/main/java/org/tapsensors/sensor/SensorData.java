package org.tapsensors.sensor;

import java.util.UUID;

public record SensorData(UUID id, double temperature, double pressure) {
}
