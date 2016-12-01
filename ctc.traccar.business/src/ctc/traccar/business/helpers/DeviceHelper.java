package ctc.traccar.business.helpers;

import java.util.ArrayList;
import java.util.List;

import ctc.traccar.data.entities.Device;
import ctc.traccar.models.vo.DeviceVo;

import org.apache.commons.beanutils.*;

import java.lang.reflect.InvocationTargetException;

public class DeviceHelper {
	
	
	
	public static List<DeviceVo> converToVo(List<Device> devs){
		List<DeviceVo> result = new ArrayList<DeviceVo>();
		
		if(devs!=null){
			for (Device dev:devs){
				result.add(converToVO(dev));
			}
		}
		
		return result;
		
	}
	
	public static List<Device> converToObjs(List<DeviceVo> Devices){
		
		List<Device> result = new ArrayList<Device>();
		
		if(Devices!=null){
			for (DeviceVo vo:Devices){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static DeviceVo converToVO (Device obj){
		try {
			DeviceVo result = new DeviceVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Device converToObj (DeviceVo vo){
		try {
			Device result = new Device();
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

