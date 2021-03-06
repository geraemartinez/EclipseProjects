package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.PositionVo;
import ctc.traccar.data.entities.Position;

public class PositionHelper {
	
	public static List<PositionVo> converToVo(List<Position> Positions){
		
		List<PositionVo> result = new ArrayList<PositionVo>();
		
		if(Positions!=null){
			for (Position usr:Positions){
				result.add(converToVO(usr));
			}
		}
		return result;	
	}
	
	public static List<Position> converToObjs(List<PositionVo> Positions){
		
		List<Position> result = new ArrayList<Position>();
		
		if(Positions!=null){
			for (PositionVo vo:Positions){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static PositionVo converToVO (Position obj){
		try {
			PositionVo result = new PositionVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Position converToObj (PositionVo vo){
		try {
			Position result = new Position();
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

