package ctc.traccar.models.vo;

import java.io.Serializable;

public class AttributeAliaseVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Integer deviceid;
	
	private String attribute;
	
	private String alias;
	
	private DeviceVo device; 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(Integer deviceid) {
		this.deviceid = deviceid;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public DeviceVo getDevice() {
		return device;
	}

	public void setDevice(DeviceVo device) {
		this.device = device;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
