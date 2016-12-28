package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;



/**
 * The persistent class for the notification_settings database table.
 * 
 */

public class NotificationSettingVo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private BigInteger id;
	
	private String fromAddress;
	
	private String password;
	
	private Integer port;
	
	private String pushbulletAccessToken;
	
	private String secureConnectionType;
	
	private String server;
	
	private Byte useAuthorization;

	private BigInteger userId;
	
	private String username;

	

	
	public NotificationSettingVo() {
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

	public Byte getUseAuthorization() {
		return this.useAuthorization;
	}

	public void setUseAuthorization(Byte useAuthorization) {
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

	
	
	

}