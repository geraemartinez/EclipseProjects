package ctc.traccar.data.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name="events")
public class Event implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="type")
	private String type;
	
	@Basic(optional = false)
	@Column(name = "servertime", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date servertime;
	
	@Column(name="deviceid")
	private Integer deviceid;
	
	@Column(name="positionid")
	private Integer positionid;
	
	@Column(name="geofenceid")
	private Integer geofenceid;
	
	@Column(name="attributes")
	private String attributes;

	@ManyToOne(optional=false)
	@JoinColumn(name="id",insertable=false, updatable=false)
	private Device device; 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getServertime() {
		return servertime;
	}

	public void setServertime(Date servertime) {
		this.servertime = servertime;
	}

	public Integer getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(Integer deviceid) {
		this.deviceid = deviceid;
	}

	public Integer getPositionid() {
		return positionid;
	}

	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}

	public Integer getGeofenceid() {
		return geofenceid;
	}

	public void setGeofenceid(Integer geofenceid) {
		this.geofenceid = geofenceid;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}
	
	
}
