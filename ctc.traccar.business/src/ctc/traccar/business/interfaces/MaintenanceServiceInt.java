package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.DeviceVo;
import ctc.traccar.api.vos.MaintenanceVo;


public interface MaintenanceServiceInt {
	public Set<MaintenanceVo> getAllMaintenance();
	public MaintenanceVo getMaintenanceById(MaintenanceVo m);
	public DeviceVo getDeviceOfMaintenance(MaintenanceVo m);
}
