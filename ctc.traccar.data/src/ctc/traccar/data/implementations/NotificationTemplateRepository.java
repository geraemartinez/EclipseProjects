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
import ctc.traccar.data.entities.NotificationTemplate;
import ctc.traccar.data.interfaces.NotificationTemplateRepositoryInt;

@Repository
public class NotificationTemplateRepository implements NotificationTemplateRepositoryInt {

	private EntityManager entityManager;
	private static Logger logger = Logger.getLogger(NotificationTemplateRepository.class);

  	public NotificationTemplateRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<NotificationTemplate> getAllNotificationTemplate() {
		try{
			StringBuilder sql = new StringBuilder("SELECT n FROM NotificationTemplate n");
			Query q = entityManager.createQuery(sql.toString());
			List<NotificationTemplate> result = (List<NotificationTemplate>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at NotificationTemplateRepository in getAllNotificationSetting() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationTemplateRepository in getAllNotificationSetting() method \n "+ e);
			return null;
		}
	}

	@Override
	public NotificationTemplate getNotificationTemplateById(NotificationTemplate nt) {
		try{
			StringBuilder sql = new StringBuilder("SELECT n FROM NotificationTemplate n WHERE n.id=:id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", nt.getId());
			NotificationTemplate result = (NotificationTemplate)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at NotificationTemplateRepository in getNotificationTemplateById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationTemplateRepository in getNotificationTemplateById() method \n "+ e);
			return null;
		}
	}

	@Override
	public NotificationTemplate getNotificationTemplateByNotificationSetting(NotificationSetting ns) {
		try{
			StringBuilder sql = new StringBuilder("SELECT n FROM NotificationTemplate n WHERE n.settingsId=:id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", ns.getId());
			NotificationTemplate result = (NotificationTemplate)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at NotificationTemplateRepository in getNotificationTemplateByNotificationSetting() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationTemplateRepository in getNotificationTemplateByNotificationSetting() method \n "+ e);
			return null;
		}
	}

	@Override
	public NotificationSetting getNotificationSettingByNotificationTemplate(NotificationTemplate nt) {
		try{
			StringBuilder sql = new StringBuilder("SELECT n FROM NotificationTemplate n WHERE n.id=:id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", nt.getId());
			NotificationTemplate result = (NotificationTemplate)q.getSingleResult();
			return result.getNotificationSetting();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at NotificationTemplateRepository in getNotificationSettingByNotificationTemplate() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationTemplateRepository in getNotificationSettingByNotificationTemplate() method \n "+ e);
			return null;
		}
	}

}
