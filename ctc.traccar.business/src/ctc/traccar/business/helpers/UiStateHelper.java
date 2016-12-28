package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.UiStateVo;
import ctc.traccar.data.entities.UiState;

public class UiStateHelper {
	
	
	
	public static List<UiStateVo> converToVo(List<UiState> UiStates){
		List<UiStateVo> result = new ArrayList<UiStateVo>();
		
		if(UiStates!=null){
			for (UiState usr:UiStates){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<UiState> converToObjs(List<UiStateVo> UiStates){
		
		List<UiState> result = new ArrayList<UiState>();
		
		if(UiStates!=null){
			for (UiStateVo vo:UiStates){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static UiStateVo converToVO (UiState obj){
		try {
			UiStateVo result = new UiStateVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static UiState converToObj (UiStateVo vo){
		try {
			UiState result = new UiState();
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

