package ctc.traccar.business.implementations;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.api.vos.DeviceIconVo;
import ctc.traccar.api.vos.DeviceVo;
import ctc.traccar.api.vos.GroupVo;
import ctc.traccar.api.vos.PictureVo;
import ctc.traccar.api.vos.PositionVo;
import ctc.traccar.api.vos.UserVo;
import ctc.traccar.business.helpers.DeviceHelper;
import ctc.traccar.business.helpers.DeviceIconHelper;
import ctc.traccar.business.helpers.GroupHelper;
import ctc.traccar.business.helpers.PictureHelper;
import ctc.traccar.business.helpers.PositionHelper;
import ctc.traccar.business.helpers.UserHelper;
import ctc.traccar.business.interfaces.DeviceServiceInt;
import ctc.traccar.data.entities.Device;
import ctc.traccar.data.entities.DeviceIcon;
import ctc.traccar.data.entities.Group;
import ctc.traccar.data.entities.Picture;
import ctc.traccar.data.entities.Position;
import ctc.traccar.data.entities.User;
import ctc.traccar.data.interfaces.DeviceRepositoryInt;

@Service
public class DeviceService  implements DeviceServiceInt{
	
	private static Logger logger = Logger.getLogger(DeviceService.class);
	
	@Autowired
	DeviceRepositoryInt deviceRepo;

	@Override
	public List<DeviceVo> getAllDevices() {
		try {
			List<DeviceVo> result = new ArrayList<DeviceVo>();
			List<Device> devs =  deviceRepo.getAllDevices();
			
			if (devs!=null && !devs.isEmpty()){
				
				result =  DeviceHelper.converToVo(devs);
				return result;				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceService getAllDevices() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public DeviceVo getDeviceById(DeviceVo device) {
		
		try {
			
			Device toSearch =  DeviceHelper.converToObj(device);
			
			if (toSearch!=null && toSearch.getId()!=null){
			
				Device result =  deviceRepo.getDeviceById(toSearch);
				return DeviceHelper.converToVO(result);
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceService getDeviceById() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public DeviceVo getDeviceByUniqueId(DeviceVo device) {
		
		try {
			
			Device toSearch =  DeviceHelper.converToObj(device);
			
			if (toSearch!=null && toSearch.getUniqueId()!=null){
			
				Device result =  deviceRepo.getDeviceByUniqueId(toSearch);
				return DeviceHelper.converToVO(result);
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceService getDeviceByUniqueId() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public UserVo getOwnerDevice(DeviceVo device) {
		
		try {
			
			Device toSearch =  DeviceHelper.converToObj(device);
			
			if (toSearch!=null && toSearch.getId()!=null){
			
				User result =  deviceRepo.getOwnerDevice(toSearch);
				return UserHelper.converToVO(result);
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceService getOwnerDevice() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public DeviceIconVo getDeviceIcon(DeviceVo device) {
		
		try {
			
			Device toSearch =  DeviceHelper.converToObj(device);
			
			if (toSearch!=null && toSearch.getId()!=null){
			
				DeviceIcon result =  deviceRepo.getDeviceIcon(toSearch);
				return DeviceIconHelper.converToVO(result);
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceService getDeviceIcon() method : " + e.getMessage());
		}
		return null;
		
	}

	@Override
	public PictureVo getPictureDevice(DeviceVo device) {
		try {
			
			Device toSearch =  DeviceHelper.converToObj(device);
			
			if (toSearch!=null && toSearch.getId()!=null){
			
				Picture result =  deviceRepo.getPictureDevice(toSearch);
				return PictureHelper.converToVO(result);
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceService getPictureDevice() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public PositionVo getLastPositionDevice(DeviceVo device) {
		
		try {
			
			Device toSearch =  DeviceHelper.converToObj(device);
			
			if (toSearch!=null && toSearch.getId()!=null){
			
				Position result =  deviceRepo.getLastPositionDevice(toSearch);
				return  PositionHelper.converToVO(result);
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceService getLastPositionDevice() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public GroupVo getGroupDevice(DeviceVo device) {
		
		try {
			
			Device toSearch =  DeviceHelper.converToObj(device);
			
			if (toSearch!=null && toSearch.getId()!=null){
			
				Group result =  deviceRepo.getGroupDevice(toSearch);
				return  GroupHelper.converToVO(result);
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceService getGroupDevice() method : " + e.getMessage());
		}
		return null;
	}
	

}
