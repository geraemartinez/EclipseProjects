package ctc.traccar.data.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name="statistics")
public class Statistic implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Basic(optional = false)
	@Column(name = "capturetime", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date capturetime;
	
	@Column(name="activeusers")
	private Integer activeusers;
	
	@Column(name="activedevices")
	private Integer activedevices;
	
	@Column(name="requests")
	private Integer requests;
	
	@Column(name="messagesreceived")
	private Integer messagesreceived;
	
	@Column(name="messagesstored")
	private Integer messagesstored;
	
	@Column(name="attributes")
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