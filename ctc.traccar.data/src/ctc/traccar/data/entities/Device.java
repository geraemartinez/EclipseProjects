package ctc.traccar.data.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table (name="devices")
public class Device implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="uniqueid",unique=true)
	private String uniqueid;
	
	@Basic(optional = false)
	@Column(name = "lastupdate", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastupdate;
	
	@Column(name="positionid")
	private Integer positionid;
	
	@Column(name="groupid")
	private Integer groupid;
	
	@Column(name="attributes")
	private String attributes;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="model")
	private String model;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="category")
	private String category;
	
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
	public Date getLastTouched() {
		return lastupdate;
	}
	public void setLastTouched(Date lastupdate) {
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
	
}