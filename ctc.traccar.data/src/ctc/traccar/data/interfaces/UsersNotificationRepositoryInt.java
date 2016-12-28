package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.User;
import ctc.traccar.data.entities.UsersNotification;


public interface UsersNotificationRepositoryInt {
	
	public List<UsersNotification> getAll();
	public UsersNotification getByUserId(UsersNotification notification);
	public User getUserByUsersNotificationId(UsersNotification notification);
	
}
