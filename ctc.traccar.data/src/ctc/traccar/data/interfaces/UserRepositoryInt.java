package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.User;

public interface UserRepositoryInt {

	public List<User> getAll();
}