package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigInteger;
import java.util.List;


/**
 * COLUMNS AND MAPS READY
 * 
 */
@Entity
@Table(name="groups")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="name")
	private String name;
	
	@Column(name="parent_id")
	private BigInteger parentId;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="parent_id",insertable=false, updatable = false)
	private Group parent;
	
    @OneToMany(mappedBy="parent")
    private List<Group> groups;

	@ManyToMany
	  @JoinTable(
	      name="groups_users",
	  joinColumns= 
	  	@JoinColumn (name="group_id"),
	  inverseJoinColumns= 
	  	@JoinColumn(name="user_id"))
	private List<User> users;
	
	public Group() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
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

	public BigInteger getParentId() {
		return this.parentId;
	}

	public void setParentId(BigInteger parentId) {
		this.parentId = parentId;
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


	
}