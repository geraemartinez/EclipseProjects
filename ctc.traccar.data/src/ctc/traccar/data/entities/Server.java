package ctc.traccar.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="server")
public class Server implements Serializable {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="registration")
	private Boolean registration;
	
	@Column(name="latitude")
	private Double latitude;
	
	@Column(name="longitude")
	private Double longitude;
	
	@Column(name="zoom")
	private Integer zoom;
	
	@Column(name="map")
	private String map;
	
	@Column(name="distanceunit")
	private String distanceunit;
	
	@Column(name="speedunit")
	private String speedunit;
	
	@Column(name="bingkey")
	private String bingkey;
	
	@Column(name="mapurl")
	private String mapurl;
	
	@Column(name="readonly")
	private Boolean readonly;
	
	@Column(name="twelvehourformat")
	private Boolean twelvehourformat;
	
	@Column(name="attributes")
	private String attributes;
	
	@Column(name="forcesettings")
	private Boolean forcesettings;
	
	@Column(name="coordinateformat")
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
	
	
}
