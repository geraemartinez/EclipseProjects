package ctc.traccar.models.vo;

import java.io.Serializable;
import java.util.Date;



public class EventVo implements Serializable  {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String type;
	
	private Date servertime;
	
	private Integer deviceid;
	
	private Integer positionid;
	
	private Integer geofenceid;
	
	private String attributes;

	private DeviceVo device;

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

	public DeviceVo getDevice() {
		return device;
	}

	public void setDevice(DeviceVo device) {
		this.device = device;
	} 
	
	
}
