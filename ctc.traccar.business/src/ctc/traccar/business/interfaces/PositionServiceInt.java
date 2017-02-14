package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.*;

public interface PositionServiceInt {
	public List<PositionVo> getAllPosition();
	public PositionVo getPosition(PositionVo position);
	public List<PositionVo> getPositionsByDevice(DeviceVo device);
	public DeviceVo getDeviceByPosition(PositionVo position);
}
