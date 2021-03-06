package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.math.BigInteger;


/**
 * The persistent class for the notification_settings database table.
 * 
 */
@Entity
@Table(name="notification_settings")
public class NotificationSetting implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;
	
	@Column(name="fromAddress")
	private String fromAddress;
	
	@Column(name="password")
	private String password;
	
	@Column(name="port")
	private Integer port;
	
	@Column(name="pushbulletAccessToken")
	private String pushbulletAccessToken;
	
	@Column(name="secureConnectionType")
	private String secureConnectionType;
	
	@Column(name="server")
	private String server;
	
	@Column(name="useAuthorization")
	private Byte useAuthorization;

	@Column(name="user_id")
	private BigInteger userId;
	
	@Column(name="username")
	private String username;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	@JsonBackReference
	private User user;
	
	public NotificationSetting() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getFromAddress() {
		return this.fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getPushbulletAccessToken() {
		return this.pushbulletAccessToken;
	}

	public void setPushbulletAccessToken(String pushbulletAccessToken) {
		this.pushbulletAccessToken = pushbulletAccessToken;
	}

	public String getSecureConnectionType() {
		return this.secureConnectionType;
	}

	public void setSecureConnectionType(String secureConnectionType) {
		this.secureConnectionType = secureConnectionType;
	}

	public String getServer() {
		return this.server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public byte getUseAuthorization() {
		return this.useAuthorization;
	}

	public void setUseAuthorization(byte useAuthorization) {
		this.useAuthorization = useAuthorization;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}