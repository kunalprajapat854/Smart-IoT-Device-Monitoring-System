package in.iot.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.iot.dto.TelemetryRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TelemetryProducer {

	@Autowired
    private  KafkaTemplate<String, String> kafkaTemplate;

	
    private final ObjectMapper mapper = new ObjectMapper(); 

    public void sendTelemetry(TelemetryRequest request){

        try{

            String json = mapper.writeValueAsString(request);

            kafkaTemplate.send("device-telemetry", json);

            System.out.println("Message sent to Kafka: " + json);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


