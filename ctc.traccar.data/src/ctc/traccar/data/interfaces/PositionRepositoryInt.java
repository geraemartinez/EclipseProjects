package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.Device;
import ctc.traccar.data.entities.Position;

public interface PositionRepositoryInt {

	public List<Position> getAllPosition();
	public Position getPosition(Position position);
	public List<Position> getPositionsByDevice(Device device);
	public Device getDeviceByPosition(Position position);
	
	
	
}
