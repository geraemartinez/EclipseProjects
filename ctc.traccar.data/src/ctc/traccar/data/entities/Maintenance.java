package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.math.BigInteger;


/**
 * COLUMNS AND MAPS READY
 * 
 */
@Entity
@Table(name="maintenances")
public class Maintenance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;

	@Column(name="device_id")
	private BigInteger deviceId;

	@Column(name="indexNo")
	private Integer indexNo;

	@Column(name="lastService")
	private Double lastService;

	@Column(name="name")
	private String name;

	@Column(name="serviceInterval")
	private Double serviceInterval;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="device_id",insertable=false, updatable = false)
	@JsonBackReference
	private Device device;

	public Maintenance() {
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

	public Integer getIndexNo() {
		return this.indexNo;
	}

	public void setIndexNo(Integer indexNo) {
		this.indexNo = indexNo;
	}

	public Double getLastService() {
		return this.lastService;
	}

	public void setLastService(Double lastService) {
		this.lastService = lastService;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getServiceInterval() {
		return this.serviceInterval;
	}

	public void setServiceInterval(Double serviceInterval) {
		this.serviceInterval = serviceInterval;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	
}