package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.UserSettingVo;

public interface UserSettingServiceInt {
	public List<UserSettingVo> getAllUserSetting();
	public UserSettingVo getUserSettingById(UserSettingVo userSetting);
}
