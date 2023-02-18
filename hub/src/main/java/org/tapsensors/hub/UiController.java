package org.tapsensors.hub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.tapsensors.hub.sensor.SensorRepository;

@Controller
public class UiController {

    private final SensorRepository sensorRepository;

    public UiController(final SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @GetMapping("/dashboard")
    public String fetchUI(Model model) {
        model.addAttribute("sensors", sensorRepository.findAllByOrderByIdAsc());
        return "index";
    }
}
