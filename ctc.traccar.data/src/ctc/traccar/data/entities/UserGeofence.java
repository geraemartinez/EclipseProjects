package ctc.traccar.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class UserGeofence implements Serializable{
	
	@Column(name="userid")
	public Integer userid;
	@Column(name="geofenceid")
	public Integer geofenceid;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getGeofenceid() {
		return geofenceid;
	}
	public void setGeofenceid(Integer geofenceid) {
		this.geofenceid = geofenceid;
	}
	
}