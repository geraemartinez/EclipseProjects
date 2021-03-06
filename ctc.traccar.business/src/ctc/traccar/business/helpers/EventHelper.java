package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.EventVo;
import ctc.traccar.data.entities.Event;

public class EventHelper {
	
	
	
	public static List<EventVo> converToVo(List<Event> Events){
		List<EventVo> result = new ArrayList<EventVo>();
		
		if(Events!=null){
			for (Event usr:Events){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<Event> converToObjs(List<EventVo> Events){
		
		List<Event> result = new ArrayList<Event>();
		
		if(Events!=null){
			for (EventVo vo:Events){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static EventVo converToVO (Event obj){
		try {
			EventVo result = new EventVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Event converToObj (EventVo vo){
		try {
			Event result = new Event();
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

