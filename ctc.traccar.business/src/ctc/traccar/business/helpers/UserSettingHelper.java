package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.UserSettingVo;
import ctc.traccar.data.entities.UserSetting;

public class UserSettingHelper {
	
	
	
	public static List<UserSettingVo> converToVo(List<UserSetting> UserSettings){
		List<UserSettingVo> result = new ArrayList<UserSettingVo>();
		
		if(UserSettings!=null){
			for (UserSetting usr:UserSettings){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<UserSetting> converToObjs(List<UserSettingVo> UserSettings){
		
		List<UserSetting> result = new ArrayList<UserSetting>();
		
		if(UserSettings!=null){
			for (UserSettingVo vo:UserSettings){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static UserSettingVo converToVO (UserSetting obj){
		try {
			UserSettingVo result = new UserSettingVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static UserSetting converToObj (UserSettingVo vo){
		try {
			UserSetting result = new UserSetting();
			BeanUtils.copyProperties(result, vo);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}

