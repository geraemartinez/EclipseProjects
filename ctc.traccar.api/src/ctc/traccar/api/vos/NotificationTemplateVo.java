package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;



/**
 * The persistent class for the notification_templates database table.
 * 
 */

public class NotificationTemplateVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger id;
	
	private String body;

	private String contentType;

	private BigInteger settingsId;

	private String subject;

	private String type;
	

	public NotificationTemplateVo(BigInteger id) {
		super();
		this.id = id;
	}
	public NotificationTemplateVo() {
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



}