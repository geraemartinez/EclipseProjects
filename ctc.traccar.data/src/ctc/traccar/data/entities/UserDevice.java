package ctc.traccar.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@SuppressWarnings("serial")
@Embeddable
public class UserDevice implements Serializable {
	
	@Column(name="userid")
	private Integer userid;
	
	@Column(name="deviceid")
	private Integer deviceid;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(Integer deviceid) {
		this.deviceid = deviceid;
	}
}
