package ctc.traccar.data.entities;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the reports database table.
 * 
 */
@Entity
@Table(name="reports")
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;

	@Column(name="disableFilter")
	private Byte disableFilter;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fromDate")
	private Date fromDate;

	@Column(name="includeMap")
	private Byte includeMap;

	@Column(name="name")
	private String name;

	@Column(name="period")
	private String period;

	@Column(name="preview")
	private Byte preview;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="toDate")
	private Date toDate;

	@Column(name="type")
	private String type;
	
	@ManyToMany
	  @JoinTable(
	      name="reports_devices",
	      joinColumns= 
	      	@JoinColumn (name="report_id"),
	      inverseJoinColumns= 
	      	@JoinColumn(name="device_id"))
	private List<Device> devices;
	
	@ManyToMany
	  @JoinTable(
	      name="reports_geofences",
	      joinColumns= 
	      	@JoinColumn (name="report_id"),
	      inverseJoinColumns= 
	      	@JoinColumn(name="geofence_id"))
	private List<Geofence> geofence;
	
	public Report() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Byte getDisableFilter() {
		return this.disableFilter;
	}

	public void setDisableFilter(byte disableFilter) {
		this.disableFilter = disableFilter;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Byte getIncludeMap() {
		return this.includeMap;
	}

	public void setIncludeMap(byte includeMap) {
		this.includeMap = includeMap;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Byte getPreview() {
		return this.preview;
	}

	public void setPreview(byte preview) {
		this.preview = preview;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public List<Geofence> getGeofence() {
		return geofence;
	}

	public void setGeofence(List<Geofence> geofence) {
		this.geofence = geofence;
	}

	public void setDisableFilter(Byte disableFilter) {
		this.disableFilter = disableFilter;
	}

	public void setIncludeMap(Byte includeMap) {
		this.includeMap = includeMap;
	}

	public void setPreview(Byte preview) {
		this.preview = preview;
	}



}