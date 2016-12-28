package ctc.traccar.data.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.UserSetting;
import ctc.traccar.data.interfaces.UserSettingRepositoryInt;

@Repository
public class UserSettingRepository implements UserSettingRepositoryInt {

	private static Logger logger = Logger.getLogger(UserSettingRepository.class);
	private EntityManager entityManager;

  	public UserSettingRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserSetting> getAllUserSetting() {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM UserSetting u");
			Query q = entityManager.createQuery(sql.toString());
			List<UserSetting> result = (List<UserSetting>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UserSettingRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserSettingRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public UserSetting getUserSettingById(UserSetting userSetting) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM UserSetting u WHERE u.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			UserSetting result = (UserSetting)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UserSettingRepository in getUserSettingById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserSettingRepository in getUserSettingById() method \n "+ e);
			return null;
		}
	}

}
