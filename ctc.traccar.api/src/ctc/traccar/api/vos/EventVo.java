package ctc.traccar.api.vos;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;


/**
 * COLUMNS AND MAPS READY
 * 
 */

public class EventVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger id;

	private BigInteger deviceId;
	
	private Byte expired;

	private BigInteger geoFence_id;

	private BigInteger maintenanceId;

	private Byte notificationSent;

	private BigInteger positionId;

	private Date time;

	private String type;
	
	public EventVo(BigInteger id) {
		super();
		this.id = id;
	}

	public EventVo() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(BigInteger deviceId) {
		this.deviceId = deviceId;
	}

	public Byte getExpired() {
		return this.expired;
	}

	public void setExpired(Byte expired) {
		this.expired = expired;
	}

	public BigInteger getGeoFence_id() {
		return this.geoFence_id;
	}

	public void setGeoFence_id(BigInteger geoFence_id) {
		this.geoFence_id = geoFence_id;
	}

	public BigInteger getMaintenanceId() {
		return this.maintenanceId;
	}

	public void setMaintenanceId(BigInteger maintenanceId) {
		this.maintenanceId = maintenanceId;
	}

	public Byte getNotificationSent() {
		return this.notificationSent;
	}

	public void setNotificationSent(Byte notificationSent) {
		this.notificationSent = notificationSent;
	}

	public BigInteger getPositionId() {
		return this.positionId;
	}

	public void setPositionId(BigInteger positionId) {
		this.positionId = positionId;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


	
}