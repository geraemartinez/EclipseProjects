package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.ReportVo;
import ctc.traccar.data.entities.Report;

public class ReportHelper {
	
	
	
	public static List<ReportVo> converToVos(List<Report> Reports){
		List<ReportVo> result = new ArrayList<ReportVo>();
		
		if(Reports!=null){
			
			for (Report usr:Reports){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<Report> converToObjs(List<ReportVo> Reports){
		
		List<Report> result = new ArrayList<Report>();
		
		if(Reports!=null){
			for (ReportVo vo:Reports){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static ReportVo converToVO (Report obj){
		try {
			ReportVo result = new ReportVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Report converToObj (ReportVo vo){
		try {
			Report result = new Report();
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

