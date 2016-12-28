package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.*;

public interface ApplicationSettingsServiceInt {
	
	public Set<ApplicationSettingVo> getAllApplicationSettings();
	public ApplicationSettingVo getApplicationSettingById(ApplicationSettingVo app);
	public UserSettingVo getUserSettingByApplicationSetting(ApplicationSettingVo app);
	public ApplicationSettingVo getApplicationSettingByUserSettingId(UserSettingVo user);
	
}
