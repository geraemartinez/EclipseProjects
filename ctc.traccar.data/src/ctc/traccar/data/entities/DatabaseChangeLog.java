package ctc.traccar.data.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="DATABASECHANGELOG")
public class DatabaseChangeLog implements Serializable {
	
	@Id
	@Column(name="ID")
	private String ID;
	
	@Column(name="AUTHOR")
	private String AUTHOR;
	
	@Column(name="FILENAME")
	private String FILENAME;
	
	@Column(name="DATEEXECUTED")
	private Date DATEEXECUTED;
	
	@Column(name="ORDEREXECUTED")
	private Integer ORDEREXECUTED;
	
	@Column(name="EXECTYPE")
	private String EXECTYPE;
	
	@Column(name="MD5SUM")
	private String MD5SUM;
	
	@Column(name="DESCRIPTION")
	private String DESCRIPTION;
	
	@Column(name="COMMENTS")
	private String COMMENTS;
	
	@Column(name="TAG")
	private String TAG;
	
	@Column(name="LIQUIBASE")
	private String LIQUIBASE;
	
	@Column(name="CONTEXTS")
	private String CONTEXTS;
	
	@Column(name="LABELS")
	private String LABELS;
	
	@Column(name="DEPLOYMENT_ID")
	private String DEPLOYMENT_ID;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getAUTHOR() {
		return AUTHOR;
	}
	public void setAUTHOR(String aUTHOR) {
		AUTHOR = aUTHOR;
	}
	public String getFILENAME() {
		return FILENAME;
	}
	public void setFILENAME(String fILENAME) {
		FILENAME = fILENAME;
	}
	public Date getDATEEXECUTED() {
		return DATEEXECUTED;
	}
	public void setDATEEXECUTED(Date dATEEXECUTED) {
		DATEEXECUTED = dATEEXECUTED;
	}
	public Integer getORDEREXECUTED() {
		return ORDEREXECUTED;
	}
	public void setORDEREXECUTED(Integer oRDEREXECUTED) {
		ORDEREXECUTED = oRDEREXECUTED;
	}
	public String getEXECTYPE() {
		return EXECTYPE;
	}
	public void setEXECTYPE(String eXECTYPE) {
		EXECTYPE = eXECTYPE;
	}
	public String getMD5SUM() {
		return MD5SUM;
	}
	public void setMD5SUM(String mD5SUM) {
		MD5SUM = mD5SUM;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public String getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}
	public String getTAG() {
		return TAG;
	}
	public void setTAG(String tAG) {
		TAG = tAG;
	}
	public String getLIQUIBASE() {
		return LIQUIBASE;
	}
	public void setLIQUIBASE(String lIQUIBASE) {
		LIQUIBASE = lIQUIBASE;
	}
	public String getCONTEXTS() {
		return CONTEXTS;
	}
	public void setCONTEXTS(String cONTEXTS) {
		CONTEXTS = cONTEXTS;
	}
	public String getLABELS() {
		return LABELS;
	}
	public void setLABELS(String lABELS) {
		LABELS = lABELS;
	}
	public String getDEPLOYMENT_ID() {
		return DEPLOYMENT_ID;
	}
	public void setDEPLOYMENT_ID(String dEPLOYMENT_ID) {
		DEPLOYMENT_ID = dEPLOYMENT_ID;
	}
	
	
}
