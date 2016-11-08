package ctc.traccar.data.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DATABASECHANGELOGLOCK")
@SuppressWarnings("serial")
public class DatabaseChangeLogLock implements Serializable {
	
	@Id
	@Column(name="ID")
	private Integer ID;
	
	@Column(name="LOCKED")
	private Boolean LOCKED;
	
	@Column(name="LOCKGRANTED")
	private Date LOCKGRANTED;
	
	@Column(name="LOCKEDBY")
	private String LOCKEDBY;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Boolean getLOCKED() {
		return LOCKED;
	}

	public void setLOCKED(Boolean lOCKED) {
		LOCKED = lOCKED;
	}

	public Date getLOCKGRANTED() {
		return LOCKGRANTED;
	}

	public void setLOCKGRANTED(Date lOCKGRANTED) {
		LOCKGRANTED = lOCKGRANTED;
	}

	public String getLOCKEDBY() {
		return LOCKEDBY;
	}

	public void setLOCKEDBY(String lOCKEDBY) {
		LOCKEDBY = lOCKEDBY;
	}
	
	
}
