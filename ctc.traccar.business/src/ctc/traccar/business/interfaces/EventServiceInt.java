package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.*;

public interface EventServiceInt {
	public List<EventVo> getAllEvents();
	public EventVo getEventById(EventVo event);
	
	public DeviceVo getDeviceEvent(EventVo event);
	public GeofenceVo getGeofenceEvent(EventVo event);
	public MaintenanceVo getMaintenanceEvent(EventVo event);
	public PositionVo getPositionEvent(EventVo event);
	
}
