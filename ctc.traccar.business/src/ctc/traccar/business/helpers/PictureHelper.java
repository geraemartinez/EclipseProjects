package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.PictureVo;
import ctc.traccar.data.entities.Picture;

public class PictureHelper {
	
	
	
	public static List<PictureVo> converToVo(List<Picture> Pictures){
		List<PictureVo> result = new ArrayList<PictureVo>();
		
		if(Pictures!=null){
			for (Picture usr:Pictures){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<Picture> converToObjs(List<PictureVo> Pictures){
		
		List<Picture> result = new ArrayList<Picture>();
		
		if(Pictures!=null){
			for (PictureVo vo:Pictures){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static PictureVo converToVO (Picture obj){
		try {
			PictureVo result = new PictureVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Picture converToObj (PictureVo vo){
		try {
			Picture result = new Picture();
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

