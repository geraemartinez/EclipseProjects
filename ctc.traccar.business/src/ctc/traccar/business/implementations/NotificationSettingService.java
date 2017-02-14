package ctc.traccar.business.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.api.vos.NotificationSettingVo;
import ctc.traccar.api.vos.UserVo;
import ctc.traccar.business.helpers.NotificationSettingHelper;
import ctc.traccar.business.helpers.UserHelper;
import ctc.traccar.business.interfaces.NotificationSettingServiceInt;
import ctc.traccar.data.entities.NotificationSetting;
import ctc.traccar.data.entities.User;
import ctc.traccar.data.interfaces.NotificationSettingRepositoryInt;
@Service
public class NotificationSettingService implements NotificationSettingServiceInt {

private static Logger logger = Logger.getLogger(NotificationSettingService.class);
	
	@Autowired
	NotificationSettingRepositoryInt repo;
	
	@Override
	public List<NotificationSettingVo> getAllNotificationSetting() {
		try {
			List<NotificationSettingVo> result = new ArrayList<NotificationSettingVo>();
			List<NotificationSetting> notifications =  repo.getAllNotificationSetting();
			
			if (notifications!=null && !notifications.isEmpty()){
				
				result =  NotificationSettingHelper.converToVo(notifications);
				return result;
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationSettingService getAllNotificationSetting() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public NotificationSettingVo getNotificationSettingById(NotificationSettingVo notificationSetting) {
		try {
			
			NotificationSettingVo result = new NotificationSettingVo();
			
			if(notificationSetting!=null && notificationSetting.getId()!=null){
				
				NotificationSetting ToSearch = NotificationSettingHelper.converToObj(notificationSetting);
				result =  NotificationSettingHelper.converToVO(repo.getNotificationSettingById(ToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationSettingService getNotificationSettingById() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public NotificationSettingVo getNotificationSettingByUser(UserVo user) {
		try {
			
			NotificationSettingVo result = new NotificationSettingVo();
			
			if(user!=null && user.getId()!=null){
				
				User ToSearch = UserHelper.converToObj(user);
				result =  NotificationSettingHelper.converToVO(repo.getNotificationSettingByUser(ToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationSettingService getNotificationSettingByUser() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public UserVo getNotificationSettingUser(NotificationSettingVo notificationSetting) {
		try {
			
			UserVo result = new UserVo();
			
			if(notificationSetting!=null && notificationSetting.getId()!=null){
				
				NotificationSetting ToSearch = NotificationSettingHelper.converToObj(notificationSetting);
				result =  UserHelper.converToVO(repo.getNotificationSettingUser(ToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationSettingService getNotificationSettingUser() method : " + e.getMessage());
		}
		return null;
	}

}
