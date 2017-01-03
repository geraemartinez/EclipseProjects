package ctc.traccar.api.vos;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the positions database table.
 * 
 */

public class PositionVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger id;

	private String address;

	private Double altitude;

	private Double course;

	private BigInteger deviceId;

	private Double latitude;

	private Double longitude;

	private String other;

	private Double power;

	private String protocol;

	private Date serverTime;

	private Double speed;

	private Date time;

	private Byte valid;

	
	public PositionVo() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getAltitude() {
		return this.altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public Double getCourse() {
		return this.course;
	}

	public void setCourse(Double course) {
		this.course = course;
	}

	public BigInteger getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(BigInteger deviceId) {
		this.deviceId = deviceId;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Double getPower() {
		return this.power;
	}

	public void setPower(Double power) {
		this.power = power;
	}

	public String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Date getServerTime() {
		return this.serverTime;
	}

	public void setServerTime(Date serverTime) {
		this.serverTime = serverTime;
	}

	public Double getSpeed() {
		return this.speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Byte getValid() {
		return this.valid;
	}

	public void setValid(Byte valid) {
		this.valid = valid;
	}


	
}