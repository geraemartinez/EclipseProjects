package ctc.traccar.business.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.business.helpers.Hashing;
import ctc.traccar.business.helpers.UserHelper;
import ctc.traccar.data.dao.UserRepositoryInt;
import ctc.traccar.data.entities.User;
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
	public UserVo getById(UserVo vo) {
		return UserHelper.convert(userRepo.getById(UserHelper.convert(vo)));	
	}


	@Override
	public UserVo getByEmail(UserVo vo) {
		return UserHelper.convert(userRepo.getByEmail(UserHelper.convert(vo)));
	}

	@Override
	public UserVo login(UserVo vo) {
		User obj = userRepo.getByEmail(UserHelper.convert(vo));
		boolean isValid = Hashing.validatePassword(vo.getPassword(), obj.getHashedpassword(), obj.getSalt());
		if (obj != null && isValid) {
            return UserHelper.convert(obj);
        } else {
            return null;
        
        }
	}

}
