package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the positions database table.
 * 
 */
@Entity
@Table(name="positions")
public class Position implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;

	@Column(name="address")
	private String address;

	@Column(name="altitude")
	private Double altitude;

	@Column(name="course")
	private Double course;

	@Column(name="device_id")
	private BigInteger deviceId;

	@Column(name="latitude")
	private Double latitude;

	@Column(name="longitude")
	private Double longitude;

	@Column(name="other")
	private String other;

	@Column(name="power")
	private Double power;

	@Column(name="protocol")
	private String protocol;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="serverTime")
	private Date serverTime;

	@Column(name="speed")
	private Double speed;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="time")
	private Date time;

	@Column(name="valid")
	private Byte valid;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="device_id",insertable=false, updatable = false)
	@JsonManagedReference
	private Device device;

	
	public Position() {
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

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	
}