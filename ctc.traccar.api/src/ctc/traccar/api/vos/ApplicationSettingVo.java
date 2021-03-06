package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;


/**
 * COLUMNS AND MAPS READY
 * 
 */

public class ApplicationSettingVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger id;
	
	private Byte allowCommandsOnlyForAdmins;
	
	private String bingMapsKey;
	
	private String defaultPasswordHash;
	
	private Byte disallowDeviceManagementByUsers;
	
	private Byte eventRecordingEnabled;
	
	private String language;
	
	private String matchServiceURL;
	
	private Integer notificationExpirationPeriod;
	
	private Byte registrationEnabled;
	
	private String salt;
	
	private Short updateInterval;
	
	private BigInteger userSettings_id;
	

	public ApplicationSettingVo(BigInteger id) {
		super();
		this.id = id;
	}

	public ApplicationSettingVo() {
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



}