package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * COLUMNS AND MAPS READY
 * 
 */

public class DeviceIconVo implements Serializable {
	private static final long serialVersionUID = 1L;


	private BigInteger id;

	private BigInteger defaultIcon_id;

	private BigInteger offlineIcon_id;

	private BigInteger selectedIcon_id;
	

	public DeviceIconVo(BigInteger id) {
		super();
		this.id=id;
	}
	public DeviceIconVo() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getDefaultIcon_id() {
		return this.defaultIcon_id;
	}

	public void setDefaultIcon_id(BigInteger defaultIcon_id) {
		this.defaultIcon_id = defaultIcon_id;
	}

	public BigInteger getOfflineIcon_id() {
		return this.offlineIcon_id;
	}

	public void setOfflineIcon_id(BigInteger offlineIcon_id) {
		this.offlineIcon_id = offlineIcon_id;
	}

	public BigInteger getSelectedIcon_id() {
		return this.selectedIcon_id;
	}

	public void setSelectedIcon_id(BigInteger selectedIcon_id) {
		this.selectedIcon_id = selectedIcon_id;
	}


	
	

}