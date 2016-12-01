package ctc.traccar.data.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.UsersNotification;
import ctc.traccar.data.interfaces.UsersNotificationRepositoryInt;

@Repository
class UserNotificationRepository implements UsersNotificationRepositoryInt {
	private EntityManager entityManager;
	private static Logger logger = Logger.getLogger(UserRepository.class);

  	public UserNotificationRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<UsersNotification> getAll() {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM UsersNotification u");
			Query q = entityManager.createQuery(sql.toString());
			List<UsersNotification> result = (List<UsersNotification>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at UserNotificationRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserNotificationRepository in getAll() method \n "+ e);
			return null;
		}
	}

}
