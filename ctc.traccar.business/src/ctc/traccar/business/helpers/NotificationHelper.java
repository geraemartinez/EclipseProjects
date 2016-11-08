package ctc.traccar.business.helpers;

import java.util.ArrayList;
import java.util.List;

import ctc.traccar.data.entities.Notification;
import ctc.traccar.models.vo.NotificationVo;

public class NotificationHelper {
	
	public static Notification convert( NotificationVo vo){
		Notification result = new Notification();
		
		if (vo!=null){
			
			if (vo.getAttributes()!=null){
				result.setAttributes(vo.getAttributes());
			}
			
			if (vo.getType()!=null){
				result.setType(vo.getType());
			}
			
			if (vo.getUser()!=null){
				result.setUser(UserHelper.convert(vo.getUser()));
			}
			
			result.setId(vo.getId());
			result.setUserid(vo.getUserid());	
		}
		
		return result;
		
	} 
	
	public static NotificationVo convert( Notification obj){
		NotificationVo result = new NotificationVo();
		
		if (obj!=null){
			
			if (obj.getAttributes()!=null){
				result.setAttributes(obj.getAttributes());
			}
			
			if (obj.getType()!=null){
				result.setType(obj.getType());
			}
			
			if (obj.getUser()!=null){
				result.setUser(UserHelper.convert(obj.getUser()));
			}
			
			result.setId(obj.getId());
			result.setUserid(obj.getUserid());	
		}
		
		return result;		
	}
	
	public static List<NotificationVo> convertToVos (List<Notification> list){
		List<NotificationVo> result = new ArrayList<NotificationVo>();
		
		if (list!=null){
			for (Notification obj: list){
				result.add(convert(obj));
			}
		}

		return result;
	}
	
	public static List<Notification> convertToObjs (List<NotificationVo> list){
		List<Notification> result = new ArrayList<Notification>();
		
		if (list!=null){
			for (NotificationVo vo: list){
				result.add(convert(vo));
			}
		}

		return result;
	}

}
