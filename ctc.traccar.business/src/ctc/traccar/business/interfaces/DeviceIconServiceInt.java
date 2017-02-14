package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.*;

public interface DeviceIconServiceInt {

	public List<DeviceIconVo> getAllDeviceIcon();
	public DeviceIconVo getDeviceIconById(DeviceIconVo devIcon);
	public PictureVo getDefaultIconByDeviceIcon(DeviceIconVo devIcon);
	public PictureVo getofflineIconByDeviceIcon(DeviceIconVo devIcon);
	public PictureVo getselectedIconByDeviceIcon(DeviceIconVo devIcon);
}
