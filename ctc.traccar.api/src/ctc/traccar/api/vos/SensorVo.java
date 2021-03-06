package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;


/**
 * The persistent class for the sensors database table.
 * 
 */

public class SensorVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger id;

	private String description;

	private BigInteger deviceId;

	private String intervals;

	private String name;

	private String parameterName;

	private Byte visible;
	
	public SensorVo(BigInteger id) {
	
		super();
		this.id = id;
	}
	
	public SensorVo() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigInteger getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(BigInteger deviceId) {
		this.deviceId = deviceId;
	}

	public String getIntervals() {
		return this.intervals;
	}

	public void setIntervals(String intervals) {
		this.intervals = intervals;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParameterName() {
		return this.parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public Byte getVisible() {
		return this.visible;
	}

	public void setVisible(Byte visible) {
		this.visible = visible;
	}
	



}