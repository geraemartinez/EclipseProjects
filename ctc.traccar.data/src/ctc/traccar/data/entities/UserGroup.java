package ctc.traccar.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@SuppressWarnings("serial")
@Embeddable
public class UserGroup implements Serializable {

	@Column(name="userid")
	private Integer userid;
	@Column(name="groupid")
	private Integer groupid;
	
	public Integer getGroupid() {
		return groupid;
	}
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer geofenceid) {
		this.userid = geofenceid;
	}
	
}