package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.NotificationSettingVo;
import ctc.traccar.api.vos.NotificationTemplateVo;

public interface NotificationTemplateServiceInt {

	public Set<NotificationTemplateVo> getAllNotificationTemplate();
	public NotificationTemplateVo getNotificationTemplateById(NotificationTemplateVo nt );
	public NotificationTemplateVo getNotificationTemplateByNotificationSetting(NotificationSettingVo ns );
	public NotificationSettingVo getNotificationSettingByNotificationTemplate(NotificationTemplateVo nt);
}
