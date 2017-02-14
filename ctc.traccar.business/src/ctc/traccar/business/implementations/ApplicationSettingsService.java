package ctc.traccar.business.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.api.vos.ApplicationSettingVo;
import ctc.traccar.api.vos.UserSettingVo;
import ctc.traccar.business.helpers.ApplicationSettingHelper;
import ctc.traccar.business.helpers.UserSettingHelper;
import ctc.traccar.business.interfaces.ApplicationSettingsServiceInt;
import ctc.traccar.data.entities.ApplicationSetting;
import ctc.traccar.data.entities.UserSetting;
import ctc.traccar.data.interfaces.ApplicationSettingsRepositoryInt;

@Service
public class ApplicationSettingsService implements ApplicationSettingsServiceInt {
	private static Logger logger = Logger.getLogger(ApplicationSettingsService.class);

	@Autowired
	ApplicationSettingsRepositoryInt appRepo;
	
	@Override
	public List<ApplicationSettingVo> getAllApplicationSettings() {
		try {
			List<ApplicationSettingVo> result = new ArrayList<ApplicationSettingVo>();
			List<ApplicationSetting> settings =  appRepo.getAllApplicationSettings();
			
			if (settings!=null && !settings.isEmpty()){
				
				result =  ApplicationSettingHelper.converToVo(settings);
				return result;
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ApplicationSettingsService getAllApplicationSettings() method : " + e.getMessage());
		}
		return null;
	}
	
	@Override
	public ApplicationSettingVo getApplicationSettingById(ApplicationSettingVo app) {
		try {
			ApplicationSetting toSearch = ApplicationSettingHelper.converToObj(app);
			
			if (toSearch!=null && toSearch.getId()!=null){
				ApplicationSetting settings =  appRepo.getApplicationSettingById(toSearch);
				return  ApplicationSettingHelper.converToVO(settings);
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ApplicationSettingsService getApplicationSettingById() method : " + e.getMessage());
		}
		return null;
	}
	
	@Override
	public UserSettingVo getUserSettingByApplicationSetting(ApplicationSettingVo app) {
		try {
			ApplicationSetting toSearch = ApplicationSettingHelper.converToObj(app);
			
			if (toSearch!=null && toSearch.getId()!=null){
				UserSetting userSetting =  appRepo.getUserSettingByApplicationSetting(toSearch);
				return  UserSettingHelper.converToVO(userSetting);
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ApplicationSettingsService getUserSettingByApplicationSetting() method : " + e.getMessage());
		}
		return null;
	}
	
	@Override
	public ApplicationSettingVo getApplicationSettingByUserSettingId(UserSettingVo user) {
		try {
			UserSetting toSearch = UserSettingHelper.converToObj(user);
			
			if (toSearch!=null && toSearch.getId()!=null){
				ApplicationSetting Setting =  appRepo.getApplicationSettingByUserSettingId(toSearch);
				return  ApplicationSettingHelper.converToVO(Setting);
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ApplicationSettingsService getApplicationSettingByUserSettingId() method : " + e.getMessage());
		}
		return null;
	} 

}
