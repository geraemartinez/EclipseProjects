package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.GeofenceVo;
import ctc.traccar.data.entities.Geofence;

public class GeofenceHelper {
	
	
	
	public static List<GeofenceVo> converToVos(List<Geofence> Geofences){
		List<GeofenceVo> result = new ArrayList<GeofenceVo>();
		
		if(Geofences!=null){
			for (Geofence usr:Geofences){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<Geofence> converToObjs(List<GeofenceVo> Geofences){
		
		List<Geofence> result = new ArrayList<Geofence>();
		
		if(Geofences!=null){
			for (GeofenceVo vo:Geofences){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static GeofenceVo converToVO (Geofence obj){
		try {
			GeofenceVo result = new GeofenceVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Geofence converToObj (GeofenceVo vo){
		try {
			Geofence result = new Geofence();
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

