package ctc.traccar.data.dao;

import java.util.List;

import ctc.traccar.data.entities.Device;
import ctc.traccar.data.entities.Position;

public interface PositionRepositoryInt {

	public List<Position> getAll();
	public Position getById(Position obj);

	public List<Position> getByIdDevice(Position obj);
	public List<Position> getByIdDevice(Device obj);
	
}
