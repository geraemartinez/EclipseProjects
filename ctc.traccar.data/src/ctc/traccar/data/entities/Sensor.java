package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.math.BigInteger;


/**
 * The persistent class for the sensors database table.
 * 
 */
@Entity
@Table(name="sensors")
public class Sensor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;

	@Column(name="description")
	private String description;

	@Column(name="device_id")
	private BigInteger deviceId;

	@Column(name="intervals")
	private String intervals;

	@Column(name="name")
	private String name;

	@Column(name="parameterName")
	private String parameterName;

	@Column(name="visible")
	private Byte visible;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="device_id",insertable=false, updatable = false)
	@JsonBackReference
	private Device device;


	public Sensor() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigInteger getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(BigInteger deviceId) {
		this.deviceId = deviceId;
	}

	public String getIntervals() {
		return this.intervals;
	}

	public void setIntervals(String intervals) {
		this.intervals = intervals;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParameterName() {
		return this.parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public Byte getVisible() {
		return this.visible;
	}

	public void setVisible(Byte visible) {
		this.visible = visible;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	
}