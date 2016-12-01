package ctc.traccar.data.entities;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;



/**
 * COMPLETED
 */
@Entity
@Table(name="users_notifications")
public class UsersNotification implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="user_id")
	private BigInteger user_id;

	@Column(name="type")
	private String type;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	@JsonBackReference
	private User user;
		
	public BigInteger getUserId() {
		return this.user_id;
	}
	public void setUserId(BigInteger userId) {
		this.user_id = userId;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigInteger getUser_id() {
		return user_id;
	}
	public void setUser_id(BigInteger user_id) {
		this.user_id = user_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}