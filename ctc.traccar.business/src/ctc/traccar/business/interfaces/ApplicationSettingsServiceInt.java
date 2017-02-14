package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.*;

public interface ApplicationSettingsServiceInt {
	
	public List<ApplicationSettingVo> getAllApplicationSettings();
	public ApplicationSettingVo getApplicationSettingById(ApplicationSettingVo app);
	public UserSettingVo getUserSettingByApplicationSetting(ApplicationSettingVo app);
	public ApplicationSettingVo getApplicationSettingByUserSettingId(UserSettingVo user);
	
}
