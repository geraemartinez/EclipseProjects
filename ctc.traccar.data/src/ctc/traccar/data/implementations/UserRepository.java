package ctc.traccar.data.implementations;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.User;
import ctc.traccar.data.interfaces.UserRepositoryInt;
@Repository
class UserRepository implements UserRepositoryInt {
	private static Logger logger = Logger.getLogger(UserRepository.class);
	private EntityManager entityManager;

  	public UserRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM User u");
			Query q = entityManager.createQuery(sql.toString());
			List<User> result = (List<User>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at UserRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getAll() method \n "+ e);
			return null;
		}
	}
	
}
