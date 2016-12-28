package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.NotificationSetting;
import ctc.traccar.data.entities.User;

public interface NotificationSettingRepositoryInt {

	public List<NotificationSetting> getAllNotificationSetting();
	public NotificationSetting getNotificationSettingById(NotificationSetting notificationSetting);
	public NotificationSetting getNotificationSettingByUser(User user);
	public User getNotificationSettingUser(NotificationSetting notificationSetting);
	
}
