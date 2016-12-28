package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.Device;
import ctc.traccar.data.entities.Sensor;

public interface SensorRepositoryInt {

	public List<Sensor> getAllSensors();
	public Sensor getAllSensor(Sensor sensor);
	public Device getDeviceBySensor(Sensor sensor);
}
