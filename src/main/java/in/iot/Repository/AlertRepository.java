package in.iot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.iot.model.Alert;

public interface AlertRepository extends JpaRepository<Alert, Long> {

}
