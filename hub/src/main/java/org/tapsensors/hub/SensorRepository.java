package org.tapsensors.hub;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SensorRepository extends JpaRepository<SensorData, UUID> {
}
