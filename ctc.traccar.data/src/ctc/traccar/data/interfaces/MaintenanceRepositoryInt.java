package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.Device;
import ctc.traccar.data.entities.Maintenance;

public interface MaintenanceRepositoryInt {
	
	public List<Maintenance> getAllMaintenance();
	public Maintenance getMaintenanceById(Maintenance m);
	public Device getDeviceOfMaintenance(Maintenance m);
	
}
