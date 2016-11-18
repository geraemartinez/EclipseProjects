package ctc.traccar.models.vo;

import java.io.Serializable;


public class ServerVo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Boolean registration;
	
	private Double latitude;
	
	private Double longitude;
	
	private Integer zoom;
	
	private String map;
	
	private String distanceunit;
	
	private String speedunit;
	
	private String bingkey;
	
	private String mapurl;
	
	private Boolean readonly;
	
	private Boolean twelvehourformat;
	
	private String attributes;
	
	private Boolean forcesettings;
	
	private String coordinateformat;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getRegistration() {
		return registration;
	}

	public void setRegistration(Boolean registration) {
		this.registration = registration;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getZoom() {
		return zoom;
	}

	public void setZoom(Integer zoom) {
		this.zoom = zoom;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public String getDistanceunit() {
		return distanceunit;
	}

	public void setDistanceunit(String distanceunit) {
		this.distanceunit = distanceunit;
	}

	public String getSpeedunit() {
		return speedunit;
	}

	public void setSpeedunit(String speedunit) {
		this.speedunit = speedunit;
	}

	public String getBingkey() {
		return bingkey;
	}

	public void setBingkey(String bingkey) {
		this.bingkey = bingkey;
	}

	public String getMapurl() {
		return mapurl;
	}

	public void setMapurl(String mapurl) {
		this.mapurl = mapurl;
	}

	public Boolean getReadonly() {
		return readonly;
	}

	public void setReadonly(Boolean readonly) {
		this.readonly = readonly;
	}

	public Boolean getTwelvehourformat() {
		return twelvehourformat;
	}

	public void setTwelvehourformat(Boolean twelvehourformat) {
		this.twelvehourformat = twelvehourformat;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public Boolean getForcesettings() {
		return forcesettings;
	}

	public void setForcesettings(Boolean forcesettings) {
		this.forcesettings = forcesettings;
	}

	public String getCoordinateformat() {
		return coordinateformat;
	}

	public void setCoordinateformat(String coordinateformat) {
		this.coordinateformat = coordinateformat;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
