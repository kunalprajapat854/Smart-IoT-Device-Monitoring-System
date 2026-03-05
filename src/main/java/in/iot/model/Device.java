package in.iot.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Device {

	@Id
	private String deviceId;
	private String status;
	private LocalDateTime lastseen;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getLastseen() {
		return lastseen;
	}

	public void setLastseen(LocalDateTime lastseen) {
		this.lastseen = lastseen;
	}

}
