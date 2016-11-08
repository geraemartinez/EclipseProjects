package ctc.traccar.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.Notification;

@Repository
public class NotificationRepository implements NotificationRepositoryInt {

	private static Logger logger = Logger.getLogger(UserRepository.class);
	private EntityManager entityManager;

  	public NotificationRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<Notification> getAll() {
		try{
			StringBuilder sql = new StringBuilder("SELECT n FROM Notification n");
			Query q = entityManager.createQuery(sql.toString());
			return (List<Notification>)q.getResultList();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at NotificationRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public Notification getById(Notification obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT n FROM Notification n where n.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", obj.getId());	
			return (Notification)q.getResultList().get(0);
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at NotificationRepository in getById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at NotificationRepository in getById() method \n "+ e);
			return null;
		}
	}


}
