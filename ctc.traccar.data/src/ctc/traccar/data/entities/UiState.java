package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.math.BigInteger;


/**
 * The persistent class for the ui_state database table.
 * 
 */
@Entity
@Table(name="ui_state")
public class UiState implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;

	@Column(name="name")
	private String name;

	@Column(name="user_id")
	private BigInteger userId;

	@Column(name="value")
	private String value;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	@JsonBackReference
	private User user;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
}