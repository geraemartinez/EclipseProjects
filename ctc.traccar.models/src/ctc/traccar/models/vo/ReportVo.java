package ctc.traccar.models.vo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the reports database table.
 * 
 */

public class ReportVo implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private BigInteger id;

	private byte disableFilter;

	private Date fromDate;

	private byte includeMap;

	private String name;

	private String period;

	private byte preview;

	private Date toDate;

	private String type;


	public ReportVo() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public byte getDisableFilter() {
		return this.disableFilter;
	}

	public void setDisableFilter(byte disableFilter) {
		this.disableFilter = disableFilter;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public byte getIncludeMap() {
		return this.includeMap;
	}

	public void setIncludeMap(byte includeMap) {
		this.includeMap = includeMap;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public byte getPreview() {
		return this.preview;
	}

	public void setPreview(byte preview) {
		this.preview = preview;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


	
}