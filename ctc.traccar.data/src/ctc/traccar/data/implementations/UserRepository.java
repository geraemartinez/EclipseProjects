package ctc.traccar.data.implementations;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import ctc.traccar.data.entities.Geofence;
import ctc.traccar.data.entities.Report;
import ctc.traccar.data.entities.User;
import ctc.traccar.data.entities.UserSetting;
import ctc.traccar.data.interfaces.UserRepositoryInt;

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
			List<User> result = (List<User>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UserRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public User getById(User user) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM User u WHERE u.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", user.getId());
			User result = (User)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UserRepository in getById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getById() method \n "+ e);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getByEmail(User user) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM User u WHERE u.email = :email ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("email", user.getEmail());
			List<User> result = (List<User>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UserRepository in getByEmail() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getByEmail() method \n "+ e);
			return null;
		}
	}

	@Override
	public List<Report> getReports(User user) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM User u WHERE u.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", user.getId());
			User result = (User)q.getSingleResult();
			return result.getReports();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UserRepository in getReports() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getReports() method \n "+ e);
			return null;
		}
	}

	@Override
	public UserSetting getUserSetting(User user) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM User u WHERE u.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", user.getId());
			User result = (User)q.getSingleResult();
			return result.getUserSettings();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UserRepository in getUserSetting() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getUserSetting() method \n "+ e);
			return null;
		}
	}

	@Override
	public List<Geofence> getGeofences(User user) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM User u WHERE u.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", user.getId());
			User result = (User)q.getSingleResult();
			return result.getGeofences();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UserRepository in getGeofences() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getGeofences() method \n "+ e);
			return null;
		}
	}

	@Override
	public User getAccess(User user) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM User u WHERE u.login = :login AND u.password = :pass ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("login", user.getLogin());
			q.setParameter("pass", user.getPassword());
			User result = (User)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UserRepository in getAccess() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getAccess() method \n "+ e);
			return null;
		}
	}
	
	@Override
	public User getByLogin(User user) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM User u WHERE u.login = :login");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("login", user.getLogin());
			User result = (User)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UserRepository in getByLogin() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UserRepository in getByLogin() method \n "+ e);
			return null;
		}
	}

	
}
