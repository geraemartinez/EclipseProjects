package ctc.traccar.models.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.math.BigInteger;


/**
 * The persistent class for the positions database table.
 * 
 */

public class PositionVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger id;

	private String address;

	private double altitude;

	private double course;

	private BigInteger deviceId;

	private double latitude;

	private double longitude;

	private String other;

	private double power;

	private String protocol;

	private Date serverTime;

	private double speed;

	private Date time;

	private byte valid;

	private DeviceVo device;

	private List<DeviceVo> devices;
	
	private List<EventVo> events;
	
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

	public double getAltitude() {
		return this.altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public double getCourse() {
		return this.course;
	}

	public void setCourse(double course) {
		this.course = course;
	}

	public BigInteger getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(BigInteger deviceId) {
		this.deviceId = deviceId;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {
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

	public double getSpeed() {
		return this.speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public byte getValid() {
		return this.valid;
	}

	public void setValid(byte valid) {
		this.valid = valid;
	}

	public DeviceVo getDevice() {
		return device;
	}

	public void setDevice(DeviceVo device) {
		this.device = device;
	}

	public List<DeviceVo> getDevices() {
		return devices;
	}

	public void setDevices(List<DeviceVo> devices) {
		this.devices = devices;
	}

	public List<EventVo> getEvents() {
		return events;
	}

	public void setEvents(List<EventVo> events) {
		this.events = events;
	}

	
}