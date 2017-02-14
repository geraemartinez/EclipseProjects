package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.*;

public interface GeofenceServiceInt {

	public List<GeofenceVo> getAllGeofences();
	public GeofenceVo getGeofenceById(GeofenceVo id);
	public List<DeviceVo> getDevicesGeofence(GeofenceVo id);
}
