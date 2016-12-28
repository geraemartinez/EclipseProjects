package ctc.traccar.api.vos;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
;


/**
 * The persistent class for the pictures database table.
 * 
 */

public class PictureVo implements Serializable {
	private static final long serialVersionUID = 1L;


	private BigInteger id;

	private Byte[] data;

	private Integer height;

	private String mimeType;

	private String type;

	private Integer width;

	private List<DeviceIconVo> defaultIconsDevices;

	private List<DeviceIconVo> oflineIconsDevices;
		
	private List<DeviceIconVo> selectedIconsdevices;

	private List<DeviceVo> devices;
	
	public PictureVo() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Byte[] getData() {
		return this.data;
	}

	public void setData(Byte[] data) {
		this.data = data;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getMimeType() {
		return this.mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}
	
	public List<DeviceIconVo> getDefaultIconsDevices() {
		return defaultIconsDevices;
	}

	public void setDefaultIconsDevices(List<DeviceIconVo> defaultIconsDevices) {
		this.defaultIconsDevices = defaultIconsDevices;
	}

	public List<DeviceIconVo> getOflineIconsDevices() {
		return oflineIconsDevices;
	}

	public void setOflineIconsDevices(List<DeviceIconVo> oflineIconsDevices) {
		this.oflineIconsDevices = oflineIconsDevices;
	}

	public List<DeviceIconVo> getSelectedIconsdevices() {
		return selectedIconsdevices;
	}

	public void setSelectedIconsdevices(List<DeviceIconVo> selectedIconsdevices) {
		this.selectedIconsdevices = selectedIconsdevices;
	}

	public List<DeviceVo> getDevices() {
		return devices;
	}

	public void setDevices(List<DeviceVo> devices) {
		this.devices = devices;
	}

}