package in.iot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import in.iot.model.Telemetry;

public interface TelemetryRepository  extends JpaRepository<Telemetry, Long>{

}
