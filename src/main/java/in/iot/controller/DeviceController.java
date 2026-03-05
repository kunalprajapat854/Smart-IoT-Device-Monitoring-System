package in.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.iot.dto.TelemetryRequest;
import in.iot.kafka.TelemetryProducer;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/device")
@RequiredArgsConstructor

public class DeviceController {

	@Autowired
	private  TelemetryProducer producer;

	@PostMapping("/data")
	public String sendData(@RequestBody TelemetryRequest request) {
		producer.sendTelemetry(request);
		return "Telemetry sent to Kafka";
	}
}