package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.models.vo.UsersNotificationVo;

public interface UsersNotificationServiceInt {
	public List<UsersNotificationVo> getAll();
	public String getAllAsJson();
}