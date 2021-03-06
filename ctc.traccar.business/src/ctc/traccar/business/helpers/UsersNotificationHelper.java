package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.UsersNotificationVo;
import ctc.traccar.data.entities.UsersNotification;

public class UsersNotificationHelper {
	public static List<UsersNotificationVo> converToVo(List<UsersNotification> users){
		List<UsersNotificationVo> result = new ArrayList<UsersNotificationVo>();
		
		if(users!=null){
			for (UsersNotification usr:users){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<UsersNotification> converToObjs(List<UsersNotificationVo> users){
		
		List<UsersNotification> result = new ArrayList<UsersNotification>();
		
		if(users!=null){
			for (UsersNotificationVo vo:users){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static UsersNotificationVo converToVO (UsersNotification obj){
		try {
			UsersNotificationVo result = new UsersNotificationVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static UsersNotification converToObj (UsersNotificationVo vo){
		try {
			UsersNotification result = new UsersNotification();
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
