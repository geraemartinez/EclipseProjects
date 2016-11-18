package ctc.traccar.data.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="groups")
public class Group implements Serializable {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="groupid")
	private Integer groupid;
	
	@Column(name="attributes")
	private String attributes;
	
	@ManyToOne
    private Group parent;
	
    @OneToMany(mappedBy="parent")
    private List<Group> groups;
	
	@ManyToMany(mappedBy="groups")
	private List<User> users;
	
	@OneToMany(mappedBy="group",targetEntity=Device.class,fetch=FetchType.EAGER)
	List<Device> devices;
	
	@ManyToMany
	  @JoinTable(
	      name="group_geofence",
	      joinColumns= 
	      	@JoinColumn (name="groupid"),
	      inverseJoinColumns= 
	      	@JoinColumn(name="geofenceid"))
	private List<Geofence> geofences;
	
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
	public Group getParent() {
		return parent;
	}
	public void setParent(Group parent) {
		this.parent = parent;
	}
	public List<Group> getGroups() {
		return groups;
	}
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Device> getDevices() {
		return devices;
	}
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	public List<Geofence> getGeofences() {
		return geofences;
	}
	public void setGeofences(List<Geofence> geofences) {
		this.geofences = geofences;
	}
	
	
	
}
