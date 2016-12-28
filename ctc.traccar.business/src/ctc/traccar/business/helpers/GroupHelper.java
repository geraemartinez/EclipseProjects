package ctc.traccar.business.helpers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import ctc.traccar.api.vos.GroupVo;
import ctc.traccar.data.entities.Group;

public class GroupHelper {
	
	
	
	public static List<GroupVo> converToVo(List<Group> Groups){
		List<GroupVo> result = new ArrayList<GroupVo>();
		
		if(Groups!=null){
			for (Group usr:Groups){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<Group> converToObjs(List<GroupVo> Groups){
		
		List<Group> result = new ArrayList<Group>();
		
		if(Groups!=null){
			for (GroupVo vo:Groups){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static GroupVo converToVO (Group obj){
		try {
			GroupVo result = new GroupVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Group converToObj (GroupVo vo){
		try {
			Group result = new Group();
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


