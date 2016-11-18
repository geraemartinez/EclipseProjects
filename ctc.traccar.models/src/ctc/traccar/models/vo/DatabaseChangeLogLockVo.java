package ctc.traccar.models.vo;

import java.io.Serializable;
import java.util.Date;


public class DatabaseChangeLogLockVo implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	private Integer ID;
	
	private Boolean LOCKED;
	
	private Date LOCKGRANTED;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
