package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.*;

public interface PositionServiceInt {
	public Set<PositionVo> getAllPosition();
	public PositionVo getPosition(PositionVo position);
	public Set<PositionVo> getPositionsByDevice(DeviceVo device);
	public DeviceVo getDeviceByPosition(PositionVo position);
}
