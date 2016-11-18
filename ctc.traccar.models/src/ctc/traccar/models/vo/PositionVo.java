package ctc.traccar.models.vo;

import java.io.Serializable;
import java.util.Date;


public class PositionVo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String protocol;
	
	private Integer deviceid;
	
	private Date servertime;
	
	private Date devicetime;

	private Date fixtime;
	
	private Boolean valid;
	
	private Double latitude;
	
	private Double longitude;
	
	private Float altitude;
	
	private Float speed;
	
	private Float course;
	
	private String address;
	
	private String attributes;
	
	private DeviceVo device;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Integer getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(Integer deviceid) {
		this.deviceid = deviceid;
	}

	public Date getServertime() {
		return servertime;
	}

	public void setServertime(Date servertime) {
		this.servertime = servertime;
	}

	public Date getDevicetime() {
		return devicetime;
	}

	public void setDevicetime(Date devicetime) {
		this.devicetime = devicetime;
	}

	public Date getFixtime() {
		return fixtime;
	}

	public void setFixtime(Date fixtime) {
		this.fixtime = fixtime;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Float getAltitude() {
		return altitude;
	}

	public void setAltitude(Float altitude) {
		this.altitude = altitude;
	}

	public Float getSpeed() {
		return speed;
	}

	public void setSpeed(Float speed) {
		this.speed = speed;
	}

	public Float getCourse() {
		return course;
	}

	public void setCourse(Float course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public DeviceVo getDevice() {
		return device;
	}

	public void setDevice(DeviceVo device) {
		this.device = device;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
