package ctc.traccar.business.interfaces;

import java.util.List;


import ctc.traccar.api.vos.UsersNotificationVo;

public interface UsersNotificationServiceInt {
	public List<UsersNotificationVo> getAll();
	public List<UsersNotificationVo> getByUserId(UsersNotificationVo notification);
}
