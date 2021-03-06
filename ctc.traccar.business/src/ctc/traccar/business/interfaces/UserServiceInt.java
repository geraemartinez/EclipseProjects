package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.*;

public interface UserServiceInt {
	
	public UserVo getById(UserVo user);
	public UserVo getByLogin(UserVo user);
	public UserVo login(UserVo user);
	
	public List<UserVo> getByEmail(UserVo user);
	public List<UserVo> getAll();
	public List<ReportVo> getReports(UserVo user);
	public List<GeofenceVo> getGeofences(UserVo user);
	
	public UserSettingVo getUserSetting(UserVo user);
} 
