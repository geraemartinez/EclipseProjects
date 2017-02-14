package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.NotificationSettingVo;
import ctc.traccar.api.vos.NotificationTemplateVo;

public interface NotificationTemplateServiceInt {

	public List<NotificationTemplateVo> getAllNotificationTemplate();
	public NotificationTemplateVo getNotificationTemplateById(NotificationTemplateVo nt );
	public NotificationTemplateVo getNotificationTemplateByNotificationSetting(NotificationSettingVo ns );
	public NotificationSettingVo getNotificationSettingByNotificationTemplate(NotificationTemplateVo nt);
}
