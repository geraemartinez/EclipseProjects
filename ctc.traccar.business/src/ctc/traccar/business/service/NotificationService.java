package ctc.traccar.business.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctc.traccar.business.helpers.NotificationHelper;
import ctc.traccar.data.dao.NotificationRepositoryInt;
import ctc.traccar.models.vo.NotificationVo;

@Service
public class NotificationService implements NotificationServiceInt  {
	
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(NotificationService.class);

	@Autowired
	NotificationRepositoryInt notificationRepo;
	
	@Override
	public List<NotificationVo> getAll() {
		return NotificationHelper.convertToVos(notificationRepo.getAll());
	}

	@Override
	public NotificationVo getById(NotificationVo vo) {
		return NotificationHelper.convert(notificationRepo.getById(NotificationHelper.convert(vo)));
	}
	
}
