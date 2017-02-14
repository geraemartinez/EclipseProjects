package ctc.traccar.business.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.api.vos.GeofenceVo;
import ctc.traccar.api.vos.ReportVo;
import ctc.traccar.api.vos.UserSettingVo;
import ctc.traccar.api.vos.UserVo;
import ctc.traccar.business.helpers.GeofenceHelper;
import ctc.traccar.business.helpers.HashingHelper;
import ctc.traccar.business.helpers.ReportHelper;
import ctc.traccar.business.helpers.UserHelper;
import ctc.traccar.business.helpers.UserSettingHelper;
import ctc.traccar.business.interfaces.UserServiceInt;
import ctc.traccar.data.entities.ApplicationSetting;
import ctc.traccar.data.entities.User;
import ctc.traccar.data.interfaces.ApplicationSettingsRepositoryInt;
import ctc.traccar.data.interfaces.UserRepositoryInt;

@Service
public class UserService implements UserServiceInt{
	
	private static Logger logger = Logger.getLogger(UserService.class);
	
	@Autowired
	UserRepositoryInt userRepo;
	
	@Autowired
	ApplicationSettingsRepositoryInt appRepo;

	@Override
	public UserVo getById(UserVo user) {

		try {
			UserVo result = new UserVo();
			
			if(user!=null && user.getId()!=null){
				
				User userToSearch = UserHelper.converToObj(user);
				userToSearch = userRepo.getById(userToSearch);
				result =  UserHelper.converToVO(userToSearch);
				return result;
				
			}
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserService getById: " + e.getMessage());
		}
		return null;

	}

	@Override
	public List<UserVo> getByEmail(UserVo user) {
		try {
			
			List<UserVo> result = new ArrayList<UserVo>();
			
			if(user!=null && user.getEmail()!=null){
				
				User userToSearch = UserHelper.converToObj(user);
				result =  UserHelper.converToVo(userRepo.getByEmail(userToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserService getByEmail() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public List<UserVo> getAll() {
		
		try {
			List<UserVo> result = new ArrayList<UserVo>();
			List<User> users =  userRepo.getAll();
			
			if (users!=null && !users.isEmpty()){
				
				result =  UserHelper.converToVo(users);
				return result;
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserService getAll() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public List<ReportVo> getReports(UserVo user) {
		try {
			
			List<ReportVo> result = new ArrayList<ReportVo>();
			
			if(user!=null && user.getId()!=null){
				
				User userToSearch = UserHelper.converToObj(user);
				result = ReportHelper.converToVos(userRepo.getReports(userToSearch));
				return result;
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserService getReports() method : " + e.getMessage());
			
		}
		return null;
	}

	@Override
	public List<GeofenceVo> getGeofences(UserVo user) {
		try {
			
			List<GeofenceVo> result = new ArrayList<GeofenceVo>();
			
			if(user!=null && user.getId()!=null){
				
				User userToSearch = UserHelper.converToObj(user);
				result = GeofenceHelper.converToVos(userRepo.getGeofences(userToSearch));
				return result;
				
			}
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserService getGeofences() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public UserSettingVo getUserSetting(UserVo user) {
		try {
			
			UserSettingVo result = new UserSettingVo();
			
			if(user!=null && user.getId()!=null){
				
				User userToSearch = UserHelper.converToObj(user);
				result = UserSettingHelper.converToVO(userRepo.getUserSetting(userToSearch));
				return result;
				
			}			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserService getUserSetting() method : " + e.getMessage());	
		}
		return null;
	}

	@Override
	public UserVo getByLogin(UserVo user) {
		try {
			
			UserVo result = new UserVo();
			
			if(user!=null && user.getLogin()!=null){
				
				User userToSearch = UserHelper.converToObj(user);
				userToSearch = userRepo.getByLogin(userToSearch);
				result =  UserHelper.converToVO(userToSearch);
					
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserService getByLogin: " + e.getMessage());	
		}
		return null;
	}

	@Override
	public UserVo login(UserVo user) {
		
		try {
			
			UserVo result = new UserVo();
			
			if(user!=null && user.getLogin()!=null){
			
				List<ApplicationSetting> settings = appRepo.getAllApplicationSettings();
				ApplicationSetting setting =settings.get(0);
				
				if(setting!=null && setting.getSalt()!=null){
					User userToSearch = UserHelper.converToObj(user);
					String passHashed = HashingHelper.doHash(userToSearch.getPassword(), setting.getSalt());
					userToSearch.setPassword(passHashed);
					User userLogged = userRepo.getAccess(userToSearch);
					
					if (userLogged !=null){
						result = UserHelper.converToVO(userLogged);
						return result;
					}
				}
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserService login: " + e.getMessage());	
		}
		return null;
	}

}
