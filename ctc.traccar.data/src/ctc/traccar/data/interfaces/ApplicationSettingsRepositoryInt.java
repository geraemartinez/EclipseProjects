package ctc.traccar.data.interfaces;


import java.util.List;

import ctc.traccar.data.entities.ApplicationSetting;
import ctc.traccar.data.entities.UserSetting;

public interface ApplicationSettingsRepositoryInt {

	public List<ApplicationSetting> getAllApplicationSettings();
	public ApplicationSetting getApplicationSettingById(ApplicationSetting app);
	public UserSetting getUserSettingByApplicationSetting(ApplicationSetting app);
	public ApplicationSetting getApplicationSettingByUserSettingId(UserSetting user);
}
