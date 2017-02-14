package ctc.traccar.business.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.api.vos.GroupVo;
import ctc.traccar.api.vos.UserVo;
import ctc.traccar.business.helpers.GroupHelper;
import ctc.traccar.business.helpers.UserHelper;
import ctc.traccar.business.interfaces.GroupServiceInt;
import ctc.traccar.data.entities.Group;
import ctc.traccar.data.interfaces.GroupRepositoryInt;

@Service
public class GroupService implements GroupServiceInt {
	
	private static Logger logger = Logger.getLogger(GroupService.class);
	
	@Autowired
	GroupRepositoryInt repo;
	
	@Override
	public List<GroupVo> getAllGroups() {
		try {
			List<GroupVo> result = new ArrayList<GroupVo>();
			List<Group> groups =  repo.getAllGroups();
			
			if (groups!=null && !groups.isEmpty()){
				
				result =  GroupHelper.converToVo(groups);
				return result;
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GroupService getAllGroups() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public List<GroupVo> getChildGroups(GroupVo group) {
		try {
			
			List<GroupVo> result = new ArrayList<GroupVo>();
			
			if(group!=null && group.getId()!=null){
				
				Group ToSearch = GroupHelper.converToObj(group);
				result =  GroupHelper.converToVo(repo.getChildGroups(ToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GroupService getChildGroups() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public List<UserVo> getUsers(GroupVo group) {
		try {
			
			List<UserVo> result = new ArrayList<UserVo>();
			
			if(group!=null && group.getId()!=null){
				
				Group ToSearch = GroupHelper.converToObj(group);
				result =  UserHelper.converToVo(repo.getUsers(ToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GroupService getUsers() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public GroupVo getGroupById(GroupVo group) {
		try {
			
			GroupVo result = new GroupVo();
			
			if(group!=null && group.getId()!=null){
				
				Group ToSearch = GroupHelper.converToObj(group);
				result =  GroupHelper.converToVO(repo.getGroupById(ToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GroupService getGroupById() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public GroupVo getParentGroup(GroupVo group) {
		try {
			
			GroupVo result = new GroupVo();
			
			if(group!=null && group.getId()!=null){
				
				Group ToSearch = GroupHelper.converToObj(group);
				result =  GroupHelper.converToVO(repo.getParentGroup(ToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GroupService getParentGroup() method : " + e.getMessage());
		}
		return null;
	}

}