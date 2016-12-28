package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.Device;
import ctc.traccar.data.entities.DeviceIcon;
import ctc.traccar.data.entities.Group;
import ctc.traccar.data.entities.Picture;
import ctc.traccar.data.entities.Position;
import ctc.traccar.data.entities.User;

public interface DeviceRepositoryInt {

	public List<Device> getAllDevices();
	public Device getDeviceById(Device device);
	public Device getDeviceByUniqueId(Device device);
	
	public User getOwnerDevice(Device device);
	public DeviceIcon getDeviceIcon(Device device);
	public Picture getPictureDevice(Device device);
	public Position getLastPositionDevice(Device device);
	public Group getGroupDevice(Device device );
}
