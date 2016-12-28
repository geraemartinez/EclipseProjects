package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.UserSettingVo;

public interface UserSettingServiceInt {
	public Set<UserSettingVo> getAllUserSetting();
	public UserSettingVo getUserSettingById(UserSettingVo userSetting);
}
