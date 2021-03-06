package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigInteger;


/**
 * The persistent class for the notification_templates database table.
 * 
 */
@Entity
@Table(name="notification_templates")
public class NotificationTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;
	
	@Column(name="body")
	private String body;

	@Column(name="contentType")
	private String contentType;

	@Column(name="settings_id")
	private BigInteger settingsId;

	@Column(name="subject")
	private String subject;

	@Column(name="type")
	private String type;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="settings_id", insertable = false, updatable = false)
	private NotificationSetting notificationSetting;

	public NotificationTemplate() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public BigInteger getSettingsId() {
		return this.settingsId;
	}

	public void setSettingsId(BigInteger settingsId) {
		this.settingsId = settingsId;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public NotificationSetting getNotificationSetting() {
		return notificationSetting;
	}

	public void setNotificationSetting(NotificationSetting notificationSetting) {
		this.notificationSetting = notificationSetting;
	}
	
	

}