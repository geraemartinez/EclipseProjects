package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.ApplicationSettingVo;
import ctc.traccar.data.entities.ApplicationSetting;

public class ApplicationSettingHelper {
	
	
	
	public static List<ApplicationSettingVo> converToVo(List<ApplicationSetting> ApplicationSettings){
		List<ApplicationSettingVo> result = new ArrayList<ApplicationSettingVo>();
		
		if(ApplicationSettings!=null){
			for (ApplicationSetting usr:ApplicationSettings){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<ApplicationSetting> converToObjs(List<ApplicationSettingVo> ApplicationSettings){
		
		List<ApplicationSetting> result = new ArrayList<ApplicationSetting>();
		
		if(ApplicationSettings!=null){
			for (ApplicationSettingVo vo:ApplicationSettings){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static ApplicationSettingVo converToVO (ApplicationSetting obj){
		try {
			ApplicationSettingVo result = new ApplicationSettingVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ApplicationSetting converToObj (ApplicationSettingVo vo){
		try {
			ApplicationSetting result = new ApplicationSetting();
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

