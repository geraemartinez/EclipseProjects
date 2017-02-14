package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.DeviceVo;
import ctc.traccar.api.vos.MaintenanceVo;


public interface MaintenanceServiceInt {
	public List<MaintenanceVo> getAllMaintenance();
	public MaintenanceVo getMaintenanceById(MaintenanceVo m);
	public DeviceVo getDeviceOfMaintenance(MaintenanceVo m);
}
