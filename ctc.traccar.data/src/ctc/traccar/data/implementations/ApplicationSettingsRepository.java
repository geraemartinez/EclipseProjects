package ctc.traccar.data.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.ApplicationSetting;
import ctc.traccar.data.entities.UserSetting;
import ctc.traccar.data.interfaces.ApplicationSettingsRepositoryInt;

@Repository
public class ApplicationSettingsRepository implements ApplicationSettingsRepositoryInt {

	private static Logger logger = Logger.getLogger(ApplicationSettingsRepository.class);
	private EntityManager entityManager;

  	public ApplicationSettingsRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<ApplicationSetting> getAllApplicationSettings() {
		try{
			StringBuilder sql = new StringBuilder("SELECT a FROM ApplicationSetting a");
			Query q = entityManager.createQuery(sql.toString());
			List<ApplicationSetting> result = (List<ApplicationSetting>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at ApplicationSettingsRepository in getAllApplicationSettings() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ApplicationSettingsRepository in getAllApplicationSettings() method \n "+ e);
			return null;
		}
	}

	@Override
	public ApplicationSetting getApplicationSettingById(ApplicationSetting app) {
		try{
			StringBuilder sql = new StringBuilder("SELECT a FROM ApplicationSetting a WHERE a.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", app.getId());
			ApplicationSetting result = (ApplicationSetting)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at ApplicationSettingsRepository in getApplicationSettingById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ApplicationSettingsRepository in getApplicationSettingById() method \n "+ e);
			return null;
		}
	}

	@Override
	public UserSetting getUserSettingByApplicationSetting(ApplicationSetting app) {
		try{
			StringBuilder sql = new StringBuilder("SELECT a FROM ApplicationSetting a WHERE a.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", app.getId());
			ApplicationSetting result = (ApplicationSetting)q.getSingleResult();
			return result.getUserSettings();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at ApplicationSettingsRepository in getUserSettingByApplicationSetting() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ApplicationSettingsRepository in getUserSettingByApplicationSetting() method \n "+ e);
			return null;
		}
	}

	@Override
	public ApplicationSetting getApplicationSettingByUserSettingId(UserSetting user) {
		try{
			StringBuilder sql = new StringBuilder("SELECT a FROM ApplicationSetting a WHERE a.userSettings_id = :userSettings_id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("userSettings_id", user.getId());
			ApplicationSetting result = (ApplicationSetting)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at ApplicationSettingsRepository in getApplicationSettingById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ApplicationSettingsRepository in getApplicationSettingById() method \n "+ e);
			return null;
		}
	}

}
