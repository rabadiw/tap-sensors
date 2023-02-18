package org.tapsensors.sensor;

import java.util.UUID;

public record SensorData(UUID id, int temperature, int pressure) {
}
