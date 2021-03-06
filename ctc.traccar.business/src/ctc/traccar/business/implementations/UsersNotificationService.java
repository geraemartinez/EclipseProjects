package ctc.traccar.business.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.api.vos.UsersNotificationVo;
import ctc.traccar.business.helpers.UsersNotificationHelper;
import ctc.traccar.business.interfaces.UsersNotificationServiceInt;
import ctc.traccar.data.entities.UsersNotification;
import ctc.traccar.data.interfaces.UsersNotificationRepositoryInt;

@Service
public class UsersNotificationService implements UsersNotificationServiceInt {
	
	private static Logger logger = Logger.getLogger(UsersNotificationService.class);
	
	@Autowired
	UsersNotificationRepositoryInt repo;
	
	
	@Override
	public List<UsersNotificationVo> getAll() {
		try {
			List<UsersNotificationVo> result = new ArrayList<UsersNotificationVo>();
			List<UsersNotification> userNotifications =  repo.getAll();
			
			if (userNotifications!=null && !userNotifications.isEmpty()){
				
				result =  UsersNotificationHelper.converToVo(userNotifications);
				return result;
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UsersNotificationService getAll() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public List<UsersNotificationVo> getByUserId(UsersNotificationVo notification) {
		try {
			List<UsersNotificationVo> result = new ArrayList<UsersNotificationVo>();
			
			if(notification!=null && notification.getUserId()!=null){
				
				UsersNotification userToSearch = UsersNotificationHelper.converToObj(notification);
				result =  UsersNotificationHelper.converToVo( repo.getByUserId(userToSearch));
				return result;
			}
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UsersNotificationService getByUserId: " + e.getMessage());
		}
		return null;
	}

	

}
