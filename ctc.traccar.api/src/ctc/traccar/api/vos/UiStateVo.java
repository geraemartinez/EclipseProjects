package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;


/**
 * The persistent class for the ui_state database table.
 * 
 */

public class UiStateVo implements Serializable {
	private static final long serialVersionUID = 1L;


	private BigInteger id;

	private String name;

	private BigInteger userId;

	private String value;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	


}