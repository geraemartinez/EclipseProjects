package ctc.traccar.models.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class DeviceVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private String uniqueid;
	
	private Date lastupdate;
	
	private Integer positionid;
	
	private Integer groupid;
	
	private String attributes;
	
	private String phone;
	
	private String model;
	
	private String contact;
	
	private String category;
	
	private List<PositionVo> positions;
	
	private List<EventVo> events;
	
	private List<AttributeAliaseVo> attributeAliases;
	
	private List<UserVo> users;

	private List<GeofenceVo> geofences;

	private GroupVo group;

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

	public String getUniqueid() {
		return uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public Date getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}

	public Integer getPositionid() {
		return positionid;
	}

	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<PositionVo> getPositions() {
		return positions;
	}

	public void setPositions(List<PositionVo> positions) {
		this.positions = positions;
	}

	public List<EventVo> getEvents() {
		return events;
	}

	public void setEvents(List<EventVo> events) {
		this.events = events;
	}

	public List<AttributeAliaseVo> getAttributeAliases() {
		return attributeAliases;
	}

	public void setAttributeAliases(List<AttributeAliaseVo> attributeAliases) {
		this.attributeAliases = attributeAliases;
	}

	public List<UserVo> getUsers() {
		return users;
	}

	public void setUsers(List<UserVo> users) {
		this.users = users;
	}

	public List<GeofenceVo> getGeofences() {
		return geofences;
	}

	public void setGeofences(List<GeofenceVo> geofences) {
		this.geofences = geofences;
	}

	public GroupVo getGroup() {
		return group;
	}

	public void setGroup(GroupVo group) {
		this.group = group;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	
}
