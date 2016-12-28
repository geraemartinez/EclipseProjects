package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.Device;
import ctc.traccar.data.entities.Event;
import ctc.traccar.data.entities.Geofence;
import ctc.traccar.data.entities.Maintenance;
import ctc.traccar.data.entities.Position;

public interface EventRepositoryInt {

	public List<Event> getAllEvents();
	public Event getEventById(Event event);
	
	public Device getDeviceEvent(Event event);
	public Geofence getGeofenceEvent(Event event);
	public Maintenance getMaintenanceEvent(Event event);
	public Position getPositionEvent(Event event);
	
	
}
