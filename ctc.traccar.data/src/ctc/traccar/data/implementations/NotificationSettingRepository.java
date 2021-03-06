package ctc.traccar.data.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.NotificationSetting;
import ctc.traccar.data.entities.User;
import ctc.traccar.data.interfaces.NotificationSettingRepositoryInt;

@Repository
public class NotificationSettingRepository implements NotificationSettingRepositoryInt {

	private EntityManager entityManager;
	private static Logger logger = Logger.getLogger(NotificationSettingRepository.class);

  	public NotificationSettingRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<NotificationSetting> getAllNotificationSetting() {
		try{
			StringBuilder sql = new StringBuilder("SELECT n FROM NotificationSetting n");
			Query q = entityManager.createQuery(sql.toString());
			List<NotificationSetting> result = (List<NotificationSetting>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at NotificationSettingRepository in getAllNotificationSetting() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationSettingRepository in getAllNotificationSetting() method \n "+ e);
			return null;
		}
	}

	@Override
	public NotificationSetting getNotificationSettingById(NotificationSetting notificationSetting) {
		try{
			StringBuilder sql = new StringBuilder("SELECT n FROM NotificationSetting n WHERE n.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", notificationSetting.getId());
			NotificationSetting result = (NotificationSetting)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at NotificationSettingRepository in getNotificationSettingById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationSettingRepository in getNotificationSettingById() method \n "+ e);
			return null;
		}
	}

	@Override
	public NotificationSetting getNotificationSettingByUser(User user) {
		try{
			StringBuilder sql = new StringBuilder("SELECT n FROM NotificationSetting n WHERE n.userId = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", user.getId());
			NotificationSetting result = (NotificationSetting)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at NotificationSettingRepository in getNotificationSettingByUser() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationSettingRepository in getNotificationSettingByUser() method \n "+ e);
			return null;
		}
	}

	@Override
	public User getNotificationSettingUser(NotificationSetting notificationSetting) {
		try{
			StringBuilder sql = new StringBuilder("SELECT n FROM NotificationSetting n WHERE n.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", notificationSetting.getId());
			NotificationSetting result = (NotificationSetting)q.getSingleResult();
			return result.getUser();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at NotificationSettingRepository in getNotificationSettingUser() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationSettingRepository in getNotificationSettingUser() method \n "+ e);
			return null;
		}
	}

}
