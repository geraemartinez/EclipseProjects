package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.*;


public interface DeviceServiceInt {
	
	public List<DeviceVo> getAllDevices();
	public DeviceVo getDeviceById(DeviceVo device);
	public DeviceVo getDeviceByUniqueId(DeviceVo device);
	
	public UserVo getOwnerDevice(DeviceVo device);
	public DeviceIconVo getDeviceIcon(DeviceVo device);
	public PictureVo getPictureDevice(DeviceVo device);
	public PositionVo getLastPositionDevice(DeviceVo device);
	public GroupVo getGroupDevice(DeviceVo device );

} 
