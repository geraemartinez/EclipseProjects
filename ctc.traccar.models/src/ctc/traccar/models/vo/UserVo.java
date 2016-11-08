package ctc.traccar.models.vo;

import java.io.Serializable;


public class UserVo implements Serializable  {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String hashedpassword;
	
	private String salt;
	
	private boolean readonly;
	
	private boolean admin;
	
	private String map;

	private String distanceunit;
	
	private String speedunit;
	
	private Double latitude;
	
	private Double longitude;
	
	private Integer zoom;
	
	private boolean twelvehourformat;
	
	private String attributes;
	
	private String coordinateformat;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHashedpassword() {
		return hashedpassword;
	}

	public void setHashedpassword(String hashedpassword) {
		this.hashedpassword = hashedpassword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
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

	public boolean isTwelvehourformat() {
		return twelvehourformat;
	}

	public void setTwelvehourformat(boolean twelvehourformat) {
		this.twelvehourformat = twelvehourformat;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getCoordinateformat() {
		return coordinateformat;
	}

	public void setCoordinateformat(String coordinateformat) {
		this.coordinateformat = coordinateformat;
	}

}