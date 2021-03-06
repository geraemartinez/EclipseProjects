package ctc.traccar.data.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.*;



/**
 * COLUMNS AND MAPS READY
 * 
 */
@Entity
@Table(name="geofences")
public class Geofence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;
	
	@Column(name="allDevices")
	private Byte allDevices;
	
	@Column(name="color")
	private String color;
	
	@Column(name="description")
	private String description;

	@Column(name="name")
	private String name;

	@Column(name="points")
	private String points;
	
	@Column(name="radius")
	private Float radius;
	
	@Column(name="type")
	private String type;
	
	@ManyToMany
	  @JoinTable(
	      name="devices_geofences",
	      joinColumns= 
	      	@JoinColumn (name="geofence_id"),
	      inverseJoinColumns= 
	      	@JoinColumn(name="device_id"))
	private List<Device> devices;

	public Geofence() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Byte getAllDevices() {
		return this.allDevices;
	}

	public void setAllDevices(Byte allDevices) {
		this.allDevices = allDevices;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoints() {
		return this.points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public Float getRadius() {
		return this.radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Device> getUsers() {
		return devices;
	}

	public void setUsers(List<Device> devices) {
		this.devices = devices;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	
}