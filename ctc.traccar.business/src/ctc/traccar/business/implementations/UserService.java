package ctc.traccar.business.implementations;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.helpers.UserHelper;
import ctc.traccar.business.interfaces.UserServiceInt;
import ctc.traccar.data.interfaces.UserRepositoryInt;
import ctc.traccar.models.vo.UserVo;

@Service
public class UserService implements UserServiceInt{
	
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(UserService.class);
	
	@Autowired
	UserRepositoryInt userRepo;
	
	@Override
	public List<UserVo> getAll() {
		return UserHelper.converToVo(userRepo.getAll());		
	}

	@Override
	public String getAllAsJson() {
		
		List<UserVo> usersVo = UserHelper.converToVo(userRepo.getAll());
		String result = JsonParserHelper.toJson(usersVo);
		return result;
	}

	

}