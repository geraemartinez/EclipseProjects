package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;


/**
 * The persistent class for the user_settings database table.
 * 
 */

public class UserSettingVo implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private BigInteger id;

	private String archiveMarkerType;

	private Double centerLatitude;

	private Double centerLongitude;

	private Short followedDeviceZoomLevel;

	private Byte hideDuplicates;

	private Byte hideInvalidLocations;

	private Byte hideZeroCoordinates;

	private String mapType;

	private Byte maximizeOverviewMap;

	private Double minDistance;

	private String overlays;

	private Double speedForFilter;

	private String speedModifier;

	private String speedUnit;

	private Short timePrintInterval;

	private String timeZoneId;

	private Short traceInterval;
	
	private Integer zoomLevel;

	public UserSettingVo(BigInteger id) {
		super();
		this.id =id;
	}
	
	public UserSettingVo() {
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

	public Byte getHideInvalidLocations() {
		return this.hideInvalidLocations;
	}

	public void setHideInvalidLocations(Byte hideInvalidLocations) {
		this.hideInvalidLocations = hideInvalidLocations;
	}

	public Byte getHideZeroCoordinates() {
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