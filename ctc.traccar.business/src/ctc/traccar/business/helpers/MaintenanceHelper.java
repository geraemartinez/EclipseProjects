package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.MaintenanceVo;
import ctc.traccar.data.entities.Maintenance;

public class MaintenanceHelper {
	
	
	
	public static List<MaintenanceVo> converToVo(List<Maintenance> Maintenances){
		List<MaintenanceVo> result = new ArrayList<MaintenanceVo>();
		
		if(Maintenances!=null){
			for (Maintenance usr:Maintenances){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<Maintenance> converToObjs(List<MaintenanceVo> Maintenances){
		
		List<Maintenance> result = new ArrayList<Maintenance>();
		
		if(Maintenances!=null){
			for (MaintenanceVo vo:Maintenances){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static MaintenanceVo converToVO (Maintenance obj){
		try {
			MaintenanceVo result = new MaintenanceVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Maintenance converToObj (MaintenanceVo vo){
		try {
			Maintenance result = new Maintenance();
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

