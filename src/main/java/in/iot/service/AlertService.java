package in.iot.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.iot.Repository.AlertRepository;
import in.iot.dto.TelemetryRequest;
import in.iot.model.Alert;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class AlertService {

	@Autowired
    private  AlertRepository
    alertRepository;

    public void checkAlerts(TelemetryRequest req){

        if(req.getTemperature()>80){

            createAlert(req.getDeviceId(),
                    "HIGH_TEMP",
                    "Temperature exceeded limit");
        }

        if(req.getBatteryLevel()<20){

            createAlert(req.getDeviceId(),
                    "LOW_BATTERY",
                    "Battery below threshold");
        }
    }

    private void createAlert(String deviceId,String type,String msg){

        Alert alert = new Alert();

        alert.setDeviceId(deviceId);
        alert.setType(type);
        alert.setMessage(msg);
        alert.setCreatedAt(LocalDateTime.now());

		alertRepository.save(alert);
    }
}