package in.iot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.iot.model.Device;

public interface DeviceRepository  extends JpaRepository<Device, String> {

}
