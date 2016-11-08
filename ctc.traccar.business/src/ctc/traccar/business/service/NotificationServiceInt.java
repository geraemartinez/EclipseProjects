package ctc.traccar.business.service;

import java.util.List;

import ctc.traccar.models.vo.NotificationVo;

public interface NotificationServiceInt {
	
	public List<NotificationVo> getAll();
	public NotificationVo getById(NotificationVo vo);
	
	
}
