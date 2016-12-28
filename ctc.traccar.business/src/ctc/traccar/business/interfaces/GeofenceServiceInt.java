package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.*;

public interface GeofenceServiceInt {

	public Set<GeofenceVo> getAllGeofences();
	public GeofenceVo getGeofenceById(GeofenceVo id);
	public Set<DeviceVo> getDevicesGeofence(GeofenceVo id);
}
