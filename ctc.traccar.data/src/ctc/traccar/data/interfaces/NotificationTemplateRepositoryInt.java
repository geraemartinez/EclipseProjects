package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.NotificationSetting;
import ctc.traccar.data.entities.NotificationTemplate;

public interface NotificationTemplateRepositoryInt {
	
	public List<NotificationTemplate> getAllNotificationTemplate();
	public NotificationTemplate getNotificationTemplateById(NotificationTemplate nt );
	public NotificationTemplate getNotificationTemplateByNotificationSetting(NotificationSetting ns );
	public NotificationSetting getNotificationSettingByNotificationTemplate(NotificationTemplate nt);
	
}
