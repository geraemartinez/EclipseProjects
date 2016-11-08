package ctc.traccar.business.helpers;

import java.util.ArrayList;
import java.util.List;

import ctc.traccar.data.entities.User;
import ctc.traccar.models.vo.UserVo;

public class UserHelper {
	
	public static User convert(UserVo vo){
		User obj = new User();
		if(vo!=null){
			
			if (vo.getAttributes()!=null){
				obj.setAttributes(vo.getAttributes());
			}
			if (vo.getCoordinateformat()!=null){
				obj.setCoordinateformat(vo.getCoordinateformat());
			}
			if (vo.getDistanceunit()!=null){
				obj.setDistanceunit(vo.getDistanceunit());
			}
			if (vo.getEmail()!=null){
				obj.setEmail(vo.getEmail());
			}
			if (vo.getHashedpassword()!=null){
				obj.setHashedpassword(vo.getHashedpassword());
			}
			if (vo.getMap()!=null){
				obj.setMap(vo.getMap());
			}
			if (vo.getName()!=null){
				obj.setName(vo.getName());
			}
			if (vo.getSalt()!=null){
				obj.setSalt(vo.getSalt());
			}
			if (vo.getSpeedunit()!=null){
				obj.setSpeedunit(vo.getSpeedunit());
			}
			
			obj.setAdmin(vo.isAdmin());
			obj.setReadonly(vo.isReadonly());
			obj.setId(vo.getId());
			obj.setLatitude(vo.getLatitude());
			obj.setLongitude(vo.getLongitude());
			obj.setZoom(vo.getZoom());
			obj.setTwelvehourformat(vo.isTwelvehourformat());
		} 
		return obj;
	}
	
	public static UserVo convert(User obj){
		UserVo vo = new UserVo();
		if(obj!=null){
			
			if (obj.getAttributes()!=null){
				vo.setAttributes(obj.getAttributes());
			}
			if (obj.getCoordinateformat()!=null){
				vo.setCoordinateformat(obj.getCoordinateformat());
			}
			if (obj.getDistanceunit()!=null){
				vo.setDistanceunit(obj.getDistanceunit());
			}
			if (obj.getEmail()!=null){
				vo.setEmail(obj.getEmail());
			}
			if (obj.getHashedpassword()!=null){
				vo.setHashedpassword(obj.getHashedpassword());
			}
			if (obj.getMap()!=null){
				vo.setMap(obj.getMap());
			}
			if (obj.getName()!=null){
				vo.setName(obj.getName());
			}
			if (obj.getSalt()!=null){
				vo.setSalt(obj.getSalt());
			}
			if (obj.getSpeedunit()!=null){
				vo.setSpeedunit(obj.getSpeedunit());
			}
			
			vo.setAdmin(obj.isAdmin());
			vo.setReadonly(obj.isReadonly());
			vo.setId(obj.getId());
			vo.setLatitude(obj.getLatitude());
			vo.setLongitude(obj.getLongitude());
			vo.setZoom(obj.getZoom());
			vo.setTwelvehourformat(obj.isTwelvehourformat());
		} 
		return vo;
	}
	
	public static List<UserVo> converToVo(List<User> users){
		List<UserVo> result = new ArrayList<UserVo>();
		for (User usr:users){
			result.add(convert(usr));
		}
		return result;
		
	}
	
	public static List<User> converToObjs(List<UserVo> users){
		
		List<User> result = new ArrayList<User>();
		for (UserVo vo:users){
			result.add(convert(vo));
		}
		return result;
	}
}
