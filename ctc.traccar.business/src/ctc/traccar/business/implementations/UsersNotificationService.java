package ctc.traccar.business.implementations;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.helpers.UsersNotificationHelper;
import ctc.traccar.business.interfaces.UsersNotificationServiceInt;
import ctc.traccar.data.interfaces.UsersNotificationRepositoryInt;
import ctc.traccar.models.vo.UsersNotificationVo;

@Service
public class UsersNotificationService implements UsersNotificationServiceInt {
	
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(UsersNotificationService.class);
	
	@Autowired
	UsersNotificationRepositoryInt userRepo;
	
	@Override
	public List<UsersNotificationVo> getAll() {
		return UsersNotificationHelper.converToVo(userRepo.getAll());	
	}

	@Override
	public String getAllAsJson() {
		List<UsersNotificationVo> vos = UsersNotificationHelper.converToVo(userRepo.getAll());
		String result= JsonParserHelper.toJson(vos);
		return result;
	}

}