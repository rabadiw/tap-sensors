package org.tapsensors.hub.sensor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SensorRepository extends JpaRepository<SensorData, UUID> {
    List<SensorData> findAllByOrderByIdAsc();
}
