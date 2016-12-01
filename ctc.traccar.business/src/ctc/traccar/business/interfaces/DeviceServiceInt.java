package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.models.vo.DeviceVo;

public interface DeviceServiceInt {
	public List<DeviceVo> getAll();
	public String getAllAsJson();
} 
