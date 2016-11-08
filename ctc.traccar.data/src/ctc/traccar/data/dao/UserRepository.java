package ctc.traccar.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.User;

@Repository
public class UserRepository implements UserRepositoryInt {
	
	
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
			return (List<User>)q.getResultList();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at UserRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public User getById(User obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM User u where u.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", obj.getId());	
			return (User)q.getResultList().get(0);
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at UserRepository in getById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getById() method \n "+ e);
			return null;
		}
	}

	@Override
	public User getByEmail(User obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM User u where u.email = :email ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("email", obj.getEmail());	
			return (User)q.getResultList().get(0);
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at UserRepository in getByEmail() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getByEmail() method \n "+ e);
			return null;
		}
	}

	

}


