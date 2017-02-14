package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.GroupVo;
import ctc.traccar.api.vos.UserVo;

public interface GroupServiceInt {

	public List<GroupVo> getAllGroups();
	public List<GroupVo> getChildGroups(GroupVo group);
	public List<UserVo> getUsers(GroupVo group);
	public GroupVo getGroupById(GroupVo group);
	public GroupVo getParentGroup(GroupVo group);
	
}
