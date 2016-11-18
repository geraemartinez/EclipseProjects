package ctc.traccar.data.dao;

import java.util.List;

import ctc.traccar.data.entities.Server;

public interface ServerRepositoryInt {

	public List<Server> getAll();
	public Server getById(Server obj);
}
