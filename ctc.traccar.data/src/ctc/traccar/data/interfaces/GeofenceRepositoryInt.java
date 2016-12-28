package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.Device;
import ctc.traccar.data.entities.Geofence;

public interface GeofenceRepositoryInt {

	public List<Geofence> getAllGeofences();
	public Geofence getGeofenceById(Geofence id);
	public List<Device> getDevicesGeofence(Geofence id);
}
