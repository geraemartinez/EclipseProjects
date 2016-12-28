package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.*;


public interface SensorServiceInt {

	public Set<SensorVo> getAllSensors();
	public SensorVo getAllSensor(SensorVo sensor);
	public DeviceVo getDeviceBySensor(SensorVo sensor);
}
