package ctc.traccar.data.dao;

import java.util.List;

import ctc.traccar.data.entities.Notification;
import ctc.traccar.data.entities.User;

public interface NotificationRepositoryInt {
	
	public List<Notification> getAll();
	public List<Notification> getByUserId(User user);
	public Notification getById(Notification obj);
}
