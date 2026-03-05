package in.iot.kafka;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import in.iot.Repository.TelemetryRepository;
import in.iot.dto.TelemetryRequest;
import in.iot.model.Telemetry;
import in.iot.service.AlertService;
import lombok.RequiredArgsConstructor;
import tools.jackson.databind.ObjectMapper;

@Service
@RequiredArgsConstructor
public class TelemetryConsumer {

	@Autowired
	private TelemetryRepository telemetryRepository;

	@Autowired
	private AlertService alertService;

	@Autowired
	private SimpMessagingTemplate websocket;

	private ObjectMapper mapper = new ObjectMapper();

	@KafkaListener(topics = "device-telemetry", groupId = "iot-group")
	public void consume(String message) {

		try {

			TelemetryRequest req = mapper.readValue(message, TelemetryRequest.class);

			Telemetry telemetry = new Telemetry();

			telemetry.setDeviceId(req.getDeviceId());
			telemetry.setTemperature(req.getTemperature());
			telemetry.setBatteryLevel(req.getBatteryLevel());
			telemetry.setLatitude(req.getLatitude());
			telemetry.setLongitude(req.getLongitude());
			telemetry.setTimestamp(LocalDateTime.now());

			telemetryRepository.save(telemetry);

			alertService.checkAlerts(req);

			websocket.convertAndSend("/topic/telemetry", req);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}