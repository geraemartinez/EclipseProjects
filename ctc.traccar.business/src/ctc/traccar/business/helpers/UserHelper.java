package ctc.traccar.business.helpers;

import java.util.ArrayList;
import java.util.List;

import ctc.traccar.data.entities.User;
import ctc.traccar.models.vo.UserVo;
import org.apache.commons.beanutils.*;

import java.lang.reflect.InvocationTargetException;

public class UserHelper {
	
	
	
	public static List<UserVo> converToVo(List<User> users){
		List<UserVo> result = new ArrayList<UserVo>();
		
		if(users!=null){
			for (User usr:users){
				result.add(converToVO(usr));
			}
		}
		
		return result;
		
	}
	
	public static List<User> converToObjs(List<UserVo> users){
		
		List<User> result = new ArrayList<User>();
		
		if(users!=null){
			for (UserVo vo:users){
				result.add(converToObj(vo));
			}
		}
		
		return result;
	}

	public static UserVo converToVO (User obj){
		try {
			UserVo result = new UserVo();
			BeanUtils.copyProperties(result, obj);
			return  result;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static User converToObj (UserVo vo){
		try {
			User result = new User();
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

