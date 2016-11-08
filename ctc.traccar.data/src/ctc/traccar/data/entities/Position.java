package ctc.traccar.data.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name="positions")
public class Position implements Serializable {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="protocol")
	private String protocol;
	
	@Column(name="deviceid")
	private Integer deviceid;
	
	@Basic(optional = false)
	@Column(name = "servertime", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date servertime;
	
	@Basic(optional = false)
	@Column(name = "devicetime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date devicetime;
	
	@Basic(optional = false)
	@Column(name = "fixtime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fixtime;
	
	@Column(name = "valid")
	private Boolean valid;
	
	@Column(name = "latitude")
	private Double latitude;
	
	@Column(name = "longitude")
	private Double longitude;
	
	@Column(name = "altitude")
	private Float altitude;
	
	@Column(name = "speed")
	private Float speed;
	
	@Column(name = "course")
	private Float course;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "attributes")
	private String attributes;
	
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
	
	
	
}
