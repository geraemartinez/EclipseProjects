package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.UserSetting;

public interface UserSettingRepositoryInt {

	public List<UserSetting> getAllUserSetting();
	public UserSetting getUserSettingById(UserSetting userSetting);
}
