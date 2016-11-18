package ctc.traccar.models.vo;

import java.io.Serializable;
import java.util.Date;


public class StatisticVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;	

	private Date capturetime;
	
	private Integer activeusers;

	private Integer activedevices;
	
	private Integer requests;

	private Integer messagesreceived;

	private Integer messagesstored;
	
	private Integer attributes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCapturetime() {
		return capturetime;
	}

	public void setCapturetime(Date capturetime) {
		this.capturetime = capturetime;
	}

	public Integer getActiveusers() {
		return activeusers;
	}

	public void setActiveusers(Integer activeusers) {
		this.activeusers = activeusers;
	}

	public Integer getActivedevices() {
		return activedevices;
	}

	public void setActivedevices(Integer activedevices) {
		this.activedevices = activedevices;
	}

	public Integer getRequests() {
		return requests;
	}

	public void setRequests(Integer requests) {
		this.requests = requests;
	}

	public Integer getMessagesreceived() {
		return messagesreceived;
	}

	public void setMessagesreceived(Integer messagesreceived) {
		this.messagesreceived = messagesreceived;
	}

	public Integer getMessagesstored() {
		return messagesstored;
	}

	public void setMessagesstored(Integer messagesstored) {
		this.messagesstored = messagesstored;
	}

	public Integer getAttributes() {
		return attributes;
	}

	public void setAttributes(Integer attributes) {
		this.attributes = attributes;
	}
	
	
}
