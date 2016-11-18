package ctc.traccar.models.vo;

import java.io.Serializable;
import java.util.List;



public class GroupVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private Integer groupid;
	
	private String attributes;
	
    private GroupVo parent;
	
    private List<GroupVo> groups;
	
	private List<UserVo> users;
	
	List<DeviceVo> devices;
	
	private List<GeofenceVo> geofences;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGroupid() {
		return groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public GroupVo getParent() {
		return parent;
	}

	public void setParent(GroupVo parent) {
		this.parent = parent;
	}

	public List<GroupVo> getGroups() {
		return groups;
	}

	public void setGroups(List<GroupVo> groups) {
		this.groups = groups;
	}

	public List<UserVo> getUsers() {
		return users;
	}

	public void setUsers(List<UserVo> users) {
		this.users = users;
	}

	public List<DeviceVo> getDevices() {
		return devices;
	}

	public void setDevices(List<DeviceVo> devices) {
		this.devices = devices;
	}

	public List<GeofenceVo> getGeofences() {
		return geofences;
	}

	public void setGeofences(List<GeofenceVo> geofences) {
		this.geofences = geofences;
	}
	
	
}
