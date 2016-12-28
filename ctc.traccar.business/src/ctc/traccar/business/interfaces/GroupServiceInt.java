package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.GroupVo;
import ctc.traccar.api.vos.UserVo;

public interface GroupServiceInt {

	public Set<GroupVo> getAllGroups();
	public Set<GroupVo> getChildGroups(GroupVo group);
	public Set<UserVo> getUsers(GroupVo group);
	public GroupVo getGroupById(GroupVo group);
	public GroupVo getParentGroup(GroupVo group);
	
}