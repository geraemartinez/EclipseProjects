package ctc.traccar.models.vo;

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

	private double centerLatitude;

	private double centerLongitude;

	private short followedDeviceZoomLevel;

	private byte hideDuplicates;

	private byte hideInvalidLocations;

	private byte hideZeroCoordinates;

	private String mapType;

	private byte maximizeOverviewMap;

	private double minDistance;

	private String overlays;

	private double speedForFilter;

	private String speedModifier;

	private String speedUnit;

	private short timePrintInterval;

	private String timeZoneId;

	private short traceInterval;
	
	private int zoomLevel;

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

	public double getCenterLatitude() {
		return this.centerLatitude;
	}

	public void setCenterLatitude(double centerLatitude) {
		this.centerLatitude = centerLatitude;
	}

	public double getCenterLongitude() {
		return this.centerLongitude;
	}

	public void setCenterLongitude(double centerLongitude) {
		this.centerLongitude = centerLongitude;
	}

	public short getFollowedDeviceZoomLevel() {
		return this.followedDeviceZoomLevel;
	}

	public void setFollowedDeviceZoomLevel(short followedDeviceZoomLevel) {
		this.followedDeviceZoomLevel = followedDeviceZoomLevel;
	}

	public byte getHideDuplicates() {
		return this.hideDuplicates;
	}

	public void setHideDuplicates(byte hideDuplicates) {
		this.hideDuplicates = hideDuplicates;
	}

	public byte getHideInvalidLocations() {
		return this.hideInvalidLocations;
	}

	public void setHideInvalidLocations(byte hideInvalidLocations) {
		this.hideInvalidLocations = hideInvalidLocations;
	}

	public byte getHideZeroCoordinates() {
		return this.hideZeroCoordinates;
	}

	public void setHideZeroCoordinates(byte hideZeroCoordinates) {
		this.hideZeroCoordinates = hideZeroCoordinates;
	}

	public String getMapType() {
		return this.mapType;
	}

	public void setMapType(String mapType) {
		this.mapType = mapType;
	}

	public byte getMaximizeOverviewMap() {
		return this.maximizeOverviewMap;
	}

	public void setMaximizeOverviewMap(byte maximizeOverviewMap) {
		this.maximizeOverviewMap = maximizeOverviewMap;
	}

	public double getMinDistance() {
		return this.minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public String getOverlays() {
		return this.overlays;
	}

	public void setOverlays(String overlays) {
		this.overlays = overlays;
	}

	public double getSpeedForFilter() {
		return this.speedForFilter;
	}

	public void setSpeedForFilter(double speedForFilter) {
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

	public short getTimePrintInterval() {
		return this.timePrintInterval;
	}

	public void setTimePrintInterval(short timePrintInterval) {
		this.timePrintInterval = timePrintInterval;
	}

	public String getTimeZoneId() {
		return this.timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public short getTraceInterval() {
		return this.traceInterval;
	}

	public void setTraceInterval(short traceInterval) {
		this.traceInterval = traceInterval;
	}

	public int getZoomLevel() {
		return this.zoomLevel;
	}

	public void setZoomLevel(int zoomLevel) {
		this.zoomLevel = zoomLevel;
	}



}