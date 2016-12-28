package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.UserVo;
import ctc.traccar.api.vos.UsersNotificationVo;

public interface UsersNotificationServiceInt {
	public Set<UsersNotificationVo> getAll();
	public UsersNotificationVo getByUserId(UsersNotificationVo notification);
	public UserVo getUserByUsersNotificationId(UsersNotificationVo notification);
}
