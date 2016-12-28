package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.DeviceIcon;
import ctc.traccar.data.entities.Picture;

public interface DeviceIconRepositoryInt {
	
	public List<DeviceIcon> getAllDeviceIcon();
	public DeviceIcon getDeviceIconById(DeviceIcon devIcon);
	public Picture getDefaultIconByDeviceIcon(DeviceIcon devIcon);
	public Picture getofflineIconByDeviceIcon(DeviceIcon devIcon);
	public Picture getselectedIconByDeviceIcon(DeviceIcon devIcon);
	
}
