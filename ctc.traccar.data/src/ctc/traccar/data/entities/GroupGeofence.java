package ctc.traccar.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class GroupGeofence implements Serializable {

	@Column(name="groupid")
	private Integer groupid;
	@Column(name="geofenceid")
	private Integer geofenceid;
	
	public Integer getGroupid() {
		return groupid;
	}
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}
	public Integer getGeofenceid() {
		return geofenceid;
	}
	public void setGeofenceid(Integer geofenceid) {
		this.geofenceid = geofenceid;
	}
	
	
}
