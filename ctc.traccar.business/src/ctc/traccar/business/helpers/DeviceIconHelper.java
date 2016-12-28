package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.DeviceIconVo;
import ctc.traccar.data.entities.DeviceIcon;

public class DeviceIconHelper {
	
	public static List<DeviceIconVo> converToVo(List<DeviceIcon> DeviceIcons){
		List<DeviceIconVo> result = new ArrayList<DeviceIconVo>();
		
		if(DeviceIcons!=null){
			for (DeviceIcon usr:DeviceIcons){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<DeviceIcon> converToObjs(List<DeviceIconVo> DeviceIcons){
		
		List<DeviceIcon> result = new ArrayList<DeviceIcon>();
		
		if(DeviceIcons!=null){
			for (DeviceIconVo vo:DeviceIcons){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static DeviceIconVo converToVO (DeviceIcon obj){
		try {
			DeviceIconVo result = new DeviceIconVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static DeviceIcon converToObj (DeviceIconVo vo){
		try {
			DeviceIcon result = new DeviceIcon();
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

