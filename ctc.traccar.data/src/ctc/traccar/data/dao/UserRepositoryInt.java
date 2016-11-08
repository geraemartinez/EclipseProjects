package ctc.traccar.data.dao;

import java.util.List;

import ctc.traccar.data.entities.User;

public interface UserRepositoryInt {

	public List<User> getAll();
	public User getById(User obj);
	public User getByEmail(User obj);
}
