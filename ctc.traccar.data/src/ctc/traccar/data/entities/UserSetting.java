package ctc.traccar.data.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.*;


/**
 * The persistent class for the user_settings database table.
 * 
 */
@Entity
@Table(name="user_settings")
public class UserSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;

	@Column(name="archiveMarkerType")
	private String archiveMarkerType;

	@Column(name="centerLatitude")
	private Double centerLatitude;

	@Column(name="centerLongitude")
	private Double centerLongitude;

	@Column(name="followedDeviceZoomLevel")
	private Short followedDeviceZoomLevel;

	@Column(name="hideDuplicates")
	private Byte hideDuplicates;

	@Column(name="hideInvalidLocations")
	private Byte hideInvalidLocations;

	@Column(name="hideZeroCoordinates")
	private Byte hideZeroCoordinates;

	@Column(name="mapType")
	private String mapType;

	@Column(name="maximizeOverviewMap")
	private Byte maximizeOverviewMap;

	@Column(name="minDistance")
	private Double minDistance;

	@Column(name="overlays")
	private String overlays;

	@Column(name="speedForFilter")
	private Double speedForFilter;

	@Column(name="speedModifier")
	private String speedModifier;

	@Column(name="speedUnit")
	private String speedUnit;

	@Column(name="timePrintInterval")
	private Short timePrintInterval;

	@Column(name="timeZoneId")
	private String timeZoneId;

	@Column(name="traceInterval")
	private Short traceInterval;
	
	@Column(name="zoomLevel")
	private Integer zoomLevel;
	
	public UserSetting() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getArchiveMarkerType() {
		return this.archiveMarkerType;
	}

	public void setArchiveMarkerType(String archiveMarkerType) {
		this.archiveMarkerType = archiveMarkerType;
	}

	public Double getCenterLatitude() {
		return this.centerLatitude;
	}

	public void setCenterLatitude(Double centerLatitude) {
		this.centerLatitude = centerLatitude;
	}

	public Double getCenterLongitude() {
		return this.centerLongitude;
	}

	public void setCenterLongitude(Double centerLongitude) {
		this.centerLongitude = centerLongitude;
	}

	public Short getFollowedDeviceZoomLevel() {
		return this.followedDeviceZoomLevel;
	}

	public void setFollowedDeviceZoomLevel(Short followedDeviceZoomLevel) {
		this.followedDeviceZoomLevel = followedDeviceZoomLevel;
	}

	public Byte getHideDuplicates() {
		return this.hideDuplicates;
	}

	public void setHideDuplicates(Byte hideDuplicates) {
		this.hideDuplicates = hideDuplicates;
	}

	public byte getHideInvalidLocations() {
		return this.hideInvalidLocations;
	}

	public void setHideInvalidLocations(Byte hideInvalidLocations) {
		this.hideInvalidLocations = hideInvalidLocations;
	}

	public byte getHideZeroCoordinates() {
		return this.hideZeroCoordinates;
	}

	public void setHideZeroCoordinates(Byte hideZeroCoordinates) {
		this.hideZeroCoordinates = hideZeroCoordinates;
	}

	public String getMapType() {
		return this.mapType;
	}

	public void setMapType(String mapType) {
		this.mapType = mapType;
	}

	public Byte getMaximizeOverviewMap() {
		return this.maximizeOverviewMap;
	}

	public void setMaximizeOverviewMap(Byte maximizeOverviewMap) {
		this.maximizeOverviewMap = maximizeOverviewMap;
	}

	public Double getMinDistance() {
		return this.minDistance;
	}

	public void setMinDistance(Double minDistance) {
		this.minDistance = minDistance;
	}

	public String getOverlays() {
		return this.overlays;
	}

	public void setOverlays(String overlays) {
		this.overlays = overlays;
	}

	public Double getSpeedForFilter() {
		return this.speedForFilter;
	}

	public void setSpeedForFilter(Double speedForFilter) {
		this.speedForFilter = speedForFilter;
	}

	public String getSpeedModifier() {
		return this.speedModifier;
	}

	public void setSpeedModifier(String speedModifier) {
		this.speedModifier = speedModifier;
	}

	public String getSpeedUnit() {
		return this.speedUnit;
	}

	public void setSpeedUnit(String speedUnit) {
		this.speedUnit = speedUnit;
	}

	public Short getTimePrintInterval() {
		return this.timePrintInterval;
	}

	public void setTimePrintInterval(Short timePrintInterval) {
		this.timePrintInterval = timePrintInterval;
	}

	public String getTimeZoneId() {
		return this.timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public Short getTraceInterval() {
		return this.traceInterval;
	}

	public void setTraceInterval(Short traceInterval) {
		this.traceInterval = traceInterval;
	}

	public Integer getZoomLevel() {
		return this.zoomLevel;
	}

	public void setZoomLevel(Integer zoomLevel) {
		this.zoomLevel = zoomLevel;
	}
	
	

}