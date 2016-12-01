package ctc.traccar.business.implementations;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.business.helpers.DeviceHelper;
import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.interfaces.DeviceServiceInt;
import ctc.traccar.data.interfaces.DeviceRepositoryInt;
import ctc.traccar.models.vo.DeviceVo;

@Service
public class DeviceService implements DeviceServiceInt{
	
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(DeviceService.class);
	
	@Autowired
	DeviceRepositoryInt deviceRepo;
	
	@Override
	public List<DeviceVo> getAll() {
		return DeviceHelper.converToVo(deviceRepo.getAll());		
	}

	@Override
	public String getAllAsJson() {
		
		List<DeviceVo> usersVo = DeviceHelper.converToVo(deviceRepo.getAll());
		String result = JsonParserHelper.toJson(usersVo);
		return result;
	}

	

}