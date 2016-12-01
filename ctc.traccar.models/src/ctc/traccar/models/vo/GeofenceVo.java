package ctc.traccar.models.vo;

import java.io.Serializable;
import java.math.BigInteger;



/**
 * COLUMNS AND MAPS READY
 * 
 */

public class GeofenceVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger id;
	
	private byte allDevices;
	
	private String color;
	
	private String description;

	private String name;

	private String points;
	
	private float radius;
	
	private String type;


	public GeofenceVo() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public byte getAllDevices() {
		return this.allDevices;
	}

	public void setAllDevices(byte allDevices) {
		this.allDevices = allDevices;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoints() {
		return this.points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public float getRadius() {
		return this.radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}