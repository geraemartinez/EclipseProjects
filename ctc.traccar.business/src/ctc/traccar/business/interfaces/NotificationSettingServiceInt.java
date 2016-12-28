package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.*;

public interface NotificationSettingServiceInt {

	public Set<NotificationSettingVo> getAllNotificationSetting();
	public NotificationSettingVo getNotificationSettingById(NotificationSettingVo notificationSetting);
	public NotificationSettingVo getNotificationSettingByUser(UserVo user);
	public UserVo getNotificationSettingUser(NotificationSettingVo notificationSetting);
}
