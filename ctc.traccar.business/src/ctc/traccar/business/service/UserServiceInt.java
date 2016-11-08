package ctc.traccar.business.service;

import java.util.List;

import ctc.traccar.models.vo.UserVo;

public interface UserServiceInt {
	public List<UserVo> getAll();
	public UserVo getById(UserVo vo);
	public UserVo getByEmail(UserVo vo);
	public UserVo login(UserVo vo);
} 
