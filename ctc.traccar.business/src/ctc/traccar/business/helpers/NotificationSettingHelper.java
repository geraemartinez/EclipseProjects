package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.NotificationSettingVo;
import ctc.traccar.data.entities.NotificationSetting;

public class NotificationSettingHelper {
	
	
	
	public static List<NotificationSettingVo> converToVo(List<NotificationSetting> NotificationSettings){
		List<NotificationSettingVo> result = new ArrayList<NotificationSettingVo>();
		
		if(NotificationSettings!=null){
			for (NotificationSetting usr:NotificationSettings){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<NotificationSetting> converToObjs(List<NotificationSettingVo> NotificationSettings){
		
		List<NotificationSetting> result = new ArrayList<NotificationSetting>();
		
		if(NotificationSettings!=null){
			for (NotificationSettingVo vo:NotificationSettings){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static NotificationSettingVo converToVO (NotificationSetting obj){
		try {
			NotificationSettingVo result = new NotificationSettingVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static NotificationSetting converToObj (NotificationSettingVo vo){
		try {
			NotificationSetting result = new NotificationSetting();
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

