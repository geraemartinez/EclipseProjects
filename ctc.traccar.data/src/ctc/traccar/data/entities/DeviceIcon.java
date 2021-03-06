package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;



/**
 * COLUMNS AND MAPS READY
 * 
 */
@Entity
@Table(name="device_icons")
public class DeviceIcon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;
	
	@Column(name="defaultIcon_id")
	private BigInteger defaultIcon_id;

	@Column(name="offlineIcon_id")
	private BigInteger offlineIcon_id;

	@Column(name="selectedIcon_id")
	private BigInteger selectedIcon_id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="defaultIcon_id",insertable=false, updatable = false)
	private Picture defaultIcon;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="offlineIcon_id",insertable=false, updatable = false)
	private Picture offlineIcon;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="selectedIcon_id",insertable=false, updatable = false)
	private Picture selectedIcon;

	public DeviceIcon() {
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

	public Picture getDefaultIcon() {
		return defaultIcon;
	}

	public void setDefaultIcon(Picture defaultIcon) {
		this.defaultIcon = defaultIcon;
	}

	public Picture getOfflineIcon() {
		return offlineIcon;
	}

	public void setOfflineIcon(Picture offlineIcon) {
		this.offlineIcon = offlineIcon;
	}

	public Picture getSelectedIcon() {
		return selectedIcon;
	}

	public void setSelectedIcon(Picture selectedIcon) {
		this.selectedIcon = selectedIcon;
	}

	
	
}