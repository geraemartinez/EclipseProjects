package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.SensorVo;
import ctc.traccar.data.entities.Sensor;

public class SensorHelper {
	
	
	
	public static List<SensorVo> converToVo(List<Sensor> Sensors){
		List<SensorVo> result = new ArrayList<SensorVo>();
		
		if(Sensors!=null){
			for (Sensor usr:Sensors){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<Sensor> converToObjs(List<SensorVo> Sensors){
		
		List<Sensor> result = new ArrayList<Sensor>();
		
		if(Sensors!=null){
			for (SensorVo vo:Sensors){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static SensorVo converToVO (Sensor obj){
		try {
			SensorVo result = new SensorVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Sensor converToObj (SensorVo vo){
		try {
			Sensor result = new Sensor();
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

