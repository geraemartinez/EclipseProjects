package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.Group;
import ctc.traccar.data.entities.User;

public interface GroupRepositoryInt {

	public List<Group> getAllGroups();
	public List<Group> getChildGroups(Group group);
	public List<User> getUsers(Group group);
	public Group getGroupById(Group group);
	public Group getParentGroup(Group group);
	
	
}
