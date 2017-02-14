package ctc.traccar.business.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.api.vos.DeviceVo;
import ctc.traccar.api.vos.GeofenceVo;
import ctc.traccar.business.helpers.DeviceHelper;
import ctc.traccar.business.helpers.GeofenceHelper;
import ctc.traccar.business.interfaces.GeofenceServiceInt;

import ctc.traccar.data.entities.Geofence;
import ctc.traccar.data.interfaces.GeofenceRepositoryInt;

@Service
public class GeofenceService implements GeofenceServiceInt {

	private static Logger logger = Logger.getLogger(GeofenceService.class);
	
	@Autowired
	GeofenceRepositoryInt repo;
	
	@Override
	public List<GeofenceVo> getAllGeofences() {
		
		try {
			List<GeofenceVo> result = new ArrayList<GeofenceVo>();
			List<Geofence> geofences =  repo.getAllGeofences();
			
			if (geofences!=null && !geofences.isEmpty()){
				
				result =  GeofenceHelper.converToVos(geofences);
				return result;
				
			}
						
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GeofenceService getAllGeofences() method : " + e.getMessage());
		}
		return null;
		
	}

	@Override
	public GeofenceVo getGeofenceById(GeofenceVo geo) {
		try {
			
			GeofenceVo result = new GeofenceVo();
			
			if(geo!=null && geo.getId()!=null){
				
				Geofence ToSearch = GeofenceHelper.converToObj(geo);
				result =  GeofenceHelper.converToVO(repo.getGeofenceById(ToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GeofenceService getGeofenceById() method : " + e.getMessage());
		}
		return null;
	}

	@Override
	public List<DeviceVo> getDevicesGeofence(GeofenceVo geo) {
		try {
			
			List<DeviceVo> result = new ArrayList<DeviceVo>();
			
			if(geo!=null && geo.getId()!=null){
				
				Geofence ToSearch = GeofenceHelper.converToObj(geo);
				result =  DeviceHelper.converToVo(repo.getDevicesGeofence(ToSearch));
				return result;
				
			}
			
		}catch(Exception e){ 
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GeofenceService getDevicesGeofence() method : " + e.getMessage());
		}
		return null;
	}

}
