package ctc.traccar.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@SuppressWarnings("serial")
@Embeddable
public class DeviceGeofence implements Serializable{
	
	@Column(name="deviceid")
	public Integer deviceid;
	
	@Column(name="deviceid")
	public Integer geofenceid;
	
	public Integer getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(Integer deviceid) {
		this.deviceid = deviceid;
	}
	public Integer getGeofenceid() {
		return geofenceid;
	}
	public void setGeofenceid(Integer geofenceid) {
		this.geofenceid = geofenceid;
	}
	
}
