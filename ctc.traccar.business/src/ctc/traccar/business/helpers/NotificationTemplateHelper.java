package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.NotificationTemplateVo;
import ctc.traccar.data.entities.NotificationTemplate;

public class NotificationTemplateHelper {
	
	
	
	public static List<NotificationTemplateVo> converToVo(List<NotificationTemplate> NotificationTemplates){
		List<NotificationTemplateVo> result = new ArrayList<NotificationTemplateVo>();
		
		if(NotificationTemplates!=null){
			for (NotificationTemplate usr:NotificationTemplates){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<NotificationTemplate> converToObjs(List<NotificationTemplateVo> NotificationTemplates){
		
		List<NotificationTemplate> result = new ArrayList<NotificationTemplate>();
		
		if(NotificationTemplates!=null){
			for (NotificationTemplateVo vo:NotificationTemplates){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static NotificationTemplateVo converToVO (NotificationTemplate obj){
		try {
			NotificationTemplateVo result = new NotificationTemplateVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static NotificationTemplate converToObj (NotificationTemplateVo vo){
		try {
			NotificationTemplate result = new NotificationTemplate();
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

