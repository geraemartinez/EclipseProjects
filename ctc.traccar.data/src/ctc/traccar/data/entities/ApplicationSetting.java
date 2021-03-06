package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigInteger;


/**
 * COLUMNS AND MAPS READY
 * 
 */
@Entity
@Table(name="application_settings")
public class ApplicationSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;
	
	@Column(name="allowCommandsOnlyForAdmins")
	private Byte allowCommandsOnlyForAdmins;
	
	@Column(name="bingMapsKey")
	private String bingMapsKey;
	
	@Column(name="defaultPasswordHash")
	private String defaultPasswordHash;
	
	@Column(name="disallowDeviceManagementByUsers")
	private Byte disallowDeviceManagementByUsers;
	
	@Column(name="eventRecordingEnabled")
	private Byte eventRecordingEnabled;
	
	@Column(name="language")
	private String language;
	
	@Column(name="matchServiceURL")
	private String matchServiceURL;
	
	@Column(name="notificationExpirationPeriod")
	private Integer notificationExpirationPeriod;
	
	@Column(name="registrationEnabled")
	private Byte registrationEnabled;
	
	@Column(name="salt")
	private String salt;
	
	@Column(name="updateInterval")
	private Short updateInterval;
	
	@Column(name="userSettings_id")
	private BigInteger userSettings_id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userSettings_id",insertable=false, updatable = false)
	private UserSetting userSettings;

	public ApplicationSetting() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Byte getAllowCommandsOnlyForAdmins() {
		return this.allowCommandsOnlyForAdmins;
	}

	public void setAllowCommandsOnlyForAdmins(Byte allowCommandsOnlyForAdmins) {
		this.allowCommandsOnlyForAdmins = allowCommandsOnlyForAdmins;
	}

	public String getBingMapsKey() {
		return this.bingMapsKey;
	}

	public void setBingMapsKey(String bingMapsKey) {
		this.bingMapsKey = bingMapsKey;
	}

	public String getDefaultPasswordHash() {
		return this.defaultPasswordHash;
	}

	public void setDefaultPasswordHash(String defaultPasswordHash) {
		this.defaultPasswordHash = defaultPasswordHash;
	}

	public Byte getDisallowDeviceManagementByUsers() {
		return this.disallowDeviceManagementByUsers;
	}

	public void setDisallowDeviceManagementByUsers(Byte disallowDeviceManagementByUsers) {
		this.disallowDeviceManagementByUsers = disallowDeviceManagementByUsers;
	}

	public Byte getEventRecordingEnabled() {
		return this.eventRecordingEnabled;
	}

	public void setEventRecordingEnabled(Byte eventRecordingEnabled) {
		this.eventRecordingEnabled = eventRecordingEnabled;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMatchServiceURL() {
		return this.matchServiceURL;
	}

	public void setMatchServiceURL(String matchServiceURL) {
		this.matchServiceURL = matchServiceURL;
	}

	public Integer getNotificationExpirationPeriod() {
		return this.notificationExpirationPeriod;
	}

	public void setNotificationExpirationPeriod(Integer notificationExpirationPeriod) {
		this.notificationExpirationPeriod = notificationExpirationPeriod;
	}

	public Byte getRegistrationEnabled() {
		return this.registrationEnabled;
	}

	public void setRegistrationEnabled(Byte registrationEnabled) {
		this.registrationEnabled = registrationEnabled;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Short getUpdateInterval() {
		return this.updateInterval;
	}

	public void setUpdateInterval(Short updateInterval) {
		this.updateInterval = updateInterval;
	}

	public BigInteger getUserSettings_id() {
		return this.userSettings_id;
	}

	public void setUserSettings_id(BigInteger userSettings_id) {
		this.userSettings_id = userSettings_id;
	}

	public UserSetting getUserSettings() {
		return userSettings;
	}

	public void setUserSettings(UserSetting userSettings) {
		this.userSettings = userSettings;
	}
	
	

}