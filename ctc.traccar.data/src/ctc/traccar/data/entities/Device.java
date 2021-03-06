package ctc.traccar.data.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

import java.math.BigInteger;

@Entity
@Table(name="devices")
public class Device implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;
	
	@Column(name="autoUpdateOdometer")
	private Byte autoUpdateOdometer;
	
	@Column(name="description")
	private String description;

	@Column(name="group_id")
	private BigInteger groupId;

	@Column(name="icon_id")
	private BigInteger iconId;

	@Column(name="iconArrowMovingColor")
	private String iconArrowMovingColor;

	@Column(name="iconArrowOfflineColor")
	private String iconArrowOfflineColor;

	@Column(name="iconArrowPausedColor")
	private String iconArrowPausedColor;

	@Column(name="iconArrowRadius")
	private Double iconArrowRadius;

	@Column(name="iconArrowStoppedColor")
	private String iconArrowStoppedColor;

	@Column(name="iconMode")
	private String iconMode;

	@Column(name="iconRotation")
	private Byte iconRotation;

	@Column(name="iconType")
	private String iconType;

	@Column(name="idleSpeedThreshold")
	private Double idleSpeedThreshold;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lastupdate")
	private Date lastupdate;
	
	@Column(name="latestPosition_id")
	private BigInteger latestPosition_id;

	@Column(name="minIdleTime")
	private Integer minIdleTime;

	@Column(name="name")
	private String name;

	@Column(name="odometer")
	private Double odometer;

	@Column(name="owner_id")
	private BigInteger ownerId;
	
	@Column(name="phoneNumber")
	private String phoneNumber;

	@Column(name="photo_id")
	private BigInteger photoId;

	@Column(name="plateNumber")
	private String plateNumber;

	@Column(name="showName")
	private Byte showName;

	@Column(name="showOdometer")
	private Byte showOdometer;

	@Column(name="showProtocol")
	private Byte showProtocol;

	@Column(name="speedLimit")
	private Double speedLimit;

	@Column(name="status")
	private String status;

	@Column(name="timeout")
	private Integer timeout;

	@Column(name="uniqueId")
	private String uniqueId;

	@Column(name="vehicleInfo")
	private String vehicleInfo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="owner_id",insertable=false, updatable = false)
	private User owner;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="icon_id",insertable=false, updatable = false)
	private DeviceIcon deviceIcon;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="photo_id",insertable=false, updatable = false)
	private Picture picture;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="latestPosition_id",insertable=false, updatable = false)
	private Position lastPosition;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="group_id",insertable=false, updatable = false)
	private Group group;
	
	

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

	public byte getShowOdometer() {
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

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public DeviceIcon getDeviceIcon() {
		return deviceIcon;
	}

	public void setDeviceIcon(DeviceIcon deviceIcon) {
		this.deviceIcon = deviceIcon;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public Position getLastPosition() {
		return lastPosition;
	}

	public void setLastPosition(Position lastPosition) {
		this.lastPosition = lastPosition;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}


}