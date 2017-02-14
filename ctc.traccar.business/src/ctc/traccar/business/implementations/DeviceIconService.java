package ctc.traccar.business.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.api.vos.DeviceIconVo;
import ctc.traccar.api.vos.PictureVo;
import ctc.traccar.business.helpers.DeviceIconHelper;
import ctc.traccar.business.helpers.PictureHelper;
import ctc.traccar.business.interfaces.DeviceIconServiceInt;
import ctc.traccar.data.entities.DeviceIcon;
import ctc.traccar.data.entities.Picture;
import ctc.traccar.data.implementations.DeviceIconRepository;

@Service
public class DeviceIconService implements DeviceIconServiceInt {

	private static Logger logger = Logger.getLogger(DeviceIconService.class);

	@Autowired 
	private DeviceIconRepository deviceIconRepo;	
	
	@Override
	public List<DeviceIconVo> getAllDeviceIcon() {
		try {
			List<DeviceIconVo> result = new ArrayList<DeviceIconVo>();
			List<DeviceIcon> icons =  deviceIconRepo.getAllDeviceIcon();
			
			if (icons!=null && !icons.isEmpty()){
				
				result =  DeviceIconHelper.converToVo(icons);
				return result;		
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceIconService getAllDeviceIcon() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public DeviceIconVo getDeviceIconById(DeviceIconVo devIcon) {
		try {
			DeviceIcon toSearch = DeviceIconHelper.converToObj(devIcon);
			
			if (toSearch!=null && toSearch.getId()!=null){
				DeviceIcon settings =  deviceIconRepo.getDeviceIconById(toSearch);
				return  DeviceIconHelper.converToVO(settings);
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceIconService getDeviceIconById() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public PictureVo getDefaultIconByDeviceIcon(DeviceIconVo devIcon) {
		try {
			DeviceIcon toSearch = DeviceIconHelper.converToObj(devIcon);
			
			if (toSearch!=null && toSearch.getId()!=null){
				Picture settings =  deviceIconRepo.getDefaultIconByDeviceIcon(toSearch);
				return  PictureHelper.converToVO(settings);
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceIconService getDefaultIconByDeviceIcon() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public PictureVo getofflineIconByDeviceIcon(DeviceIconVo devIcon) {
		try {
			DeviceIcon toSearch = DeviceIconHelper.converToObj(devIcon);
			
			if (toSearch!=null && toSearch.getId()!=null){
				Picture settings =  deviceIconRepo.getofflineIconByDeviceIcon(toSearch);
				return  PictureHelper.converToVO(settings);
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceIconService getofflineIconByDeviceIcon() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public PictureVo getselectedIconByDeviceIcon(DeviceIconVo devIcon) {
		try {
			DeviceIcon toSearch = DeviceIconHelper.converToObj(devIcon);
			
			if (toSearch!=null && toSearch.getId()!=null){
				Picture settings =  deviceIconRepo.getselectedIconByDeviceIcon(toSearch);
				return  PictureHelper.converToVO(settings);
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceIconService getselectedIconByDeviceIcon() method : " + e.getMessage());
		}
		return null;
	}

}
