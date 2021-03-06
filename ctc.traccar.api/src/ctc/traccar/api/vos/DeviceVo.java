package ctc.traccar.api.vos;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;


/**
 * COLUMNS AND MAPS READY
 * 
 */

public class DeviceVo implements Serializable {
	private static final long serialVersionUID = 1L;


	private BigInteger id;
	
	private Byte autoUpdateOdometer;
	
	private String description;

	private BigInteger groupId;

	private BigInteger iconId;

	private String iconArrowMovingColor;

	private String iconArrowOfflineColor;

	private String iconArrowPausedColor;

	private Double iconArrowRadius;

	private String iconArrowStoppedColor;

	private String iconMode;

	private Byte iconRotation;

	private String iconType;

	private Double idleSpeedThreshold;

	private Date lastupdate;
	
	private BigInteger latestPosition_id;

	private Integer minIdleTime;

	private String name;

	private Double odometer;

	private BigInteger ownerId;
	
	private String phoneNumber;

	private BigInteger photoId;

	private String plateNumber;

	private Byte showName;

	private Byte showOdometer;

	private Byte showProtocol;

	private Double speedLimit;

	private String status;

	private Integer timeout;

	private String uniqueId;

	private String vehicleInfo;	


	public DeviceVo() {
	}
	
	public DeviceVo(BigInteger id) {
		super();
		this.id = id;
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Byte getAutoUpdateOdometer() {
		return this.autoUpdateOdometer;
	}

	public void setAutoUpdateOdometer(Byte autoUpdateOdometer) {
		this.autoUpdateOdometer = autoUpdateOdometer;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigInteger getGroupId() {
		return this.groupId;
	}

	public void setGroupId(BigInteger groupId) {
		this.groupId = groupId;
	}

	public BigInteger getIconId() {
		return this.iconId;
	}

	public void setIconId(BigInteger iconId) {
		this.iconId = iconId;
	}

	public String getIconArrowMovingColor() {
		return this.iconArrowMovingColor;
	}

	public void setIconArrowMovingColor(String iconArrowMovingColor) {
		this.iconArrowMovingColor = iconArrowMovingColor;
	}

	public String getIconArrowOfflineColor() {
		return this.iconArrowOfflineColor;
	}

	public void setIconArrowOfflineColor(String iconArrowOfflineColor) {
		this.iconArrowOfflineColor = iconArrowOfflineColor;
	}

	public String getIconArrowPausedColor() {
		return this.iconArrowPausedColor;
	}

	public void setIconArrowPausedColor(String iconArrowPausedColor) {
		this.iconArrowPausedColor = iconArrowPausedColor;
	}

	public Double getIconArrowRadius() {
		return this.iconArrowRadius;
	}

	public void setIconArrowRadius(Double iconArrowRadius) {
		this.iconArrowRadius = iconArrowRadius;
	}

	public String getIconArrowStoppedColor() {
		return this.iconArrowStoppedColor;
	}

	public void setIconArrowStoppedColor(String iconArrowStoppedColor) {
		this.iconArrowStoppedColor = iconArrowStoppedColor;
	}

	public String getIconMode() {
		return this.iconMode;
	}

	public void setIconMode(String iconMode) {
		this.iconMode = iconMode;
	}

	public Byte getIconRotation() {
		return this.iconRotation;
	}

	public void setIconRotation(Byte iconRotation) {
		this.iconRotation = iconRotation;
	}

	public String getIconType() {
		return this.iconType;
	}

	public void setIconType(String iconType) {
		this.iconType = iconType;
	}

	public Double getIdleSpeedThreshold() {
		return this.idleSpeedThreshold;
	}

	public void setIdleSpeedThreshold(Double idleSpeedThreshold) {
		this.idleSpeedThreshold = idleSpeedThreshold;
	}

	public Date getLastupdate() {
		return this.lastupdate;
	}

	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}

	public BigInteger getLatestPosition_id() {
		return this.latestPosition_id;
	}

	public void setLatestPosition_id(BigInteger latestPosition_id) {
		this.latestPosition_id = latestPosition_id;
	}

	public Integer getMinIdleTime() {
		return this.minIdleTime;
	}

	public void setMinIdleTime(Integer minIdleTime) {
		this.minIdleTime = minIdleTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getOdometer() {
		return this.odometer;
	}

	public void setOdometer(Double odometer) {
		this.odometer = odometer;
	}

	public BigInteger getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(BigInteger ownerId) {
		this.ownerId = ownerId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigInteger getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(BigInteger photoId) {
		this.photoId = photoId;
	}

	public String getPlateNumber() {
		return this.plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public Byte getShowName() {
		return this.showName;
	}

	public void setShowName(Byte showName) {
		this.showName = showName;
	}

	public Byte getShowOdometer() {
		return this.showOdometer;
	}

	public void setShowOdometer(Byte showOdometer) {
		this.showOdometer = showOdometer;
	}

	public Byte getShowProtocol() {
		return this.showProtocol;
	}

	public void setShowProtocol(Byte showProtocol) {
		this.showProtocol = showProtocol;
	}

	public Double getSpeedLimit() {
		return this.speedLimit;
	}

	public void setSpeedLimit(Double speedLimit) {
		this.speedLimit = speedLimit;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getVehicleInfo() {
		return this.vehicleInfo;
	}

	public void setVehicleInfo(String vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

	
	
	


}