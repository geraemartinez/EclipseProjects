package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.Geofence;
import ctc.traccar.data.entities.Report;
import ctc.traccar.data.entities.User;
import ctc.traccar.data.entities.UserSetting;

public interface UserRepositoryInt {

	
	
	public User getById(User user);
	public User getByLogin(User user);
	public List<User> getByEmail(User user);
	
	public List<User> getAll();
	public List<Report> getReports(User user);
	public List<Geofence> getGeofences(User user);
	
	public UserSetting getUserSetting(User user);
	public User getAccess(User user);
	
	
}
