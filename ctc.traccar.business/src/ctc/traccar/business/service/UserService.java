package ctc.traccar.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.business.helpers.UserHelper;
import ctc.traccar.data.dao.UserRepositoryInt;
import ctc.traccar.models.vo.UserVo;

@Service
public class UserService implements UserServiceInt{
	
	@Autowired
	UserRepositoryInt userRepo;
	
	@Override
	public List<UserVo> getAll() {
		return UserHelper.converToVo(userRepo.getAll());		
	}
	

}