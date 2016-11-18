package ctc.traccar.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.Server;

@Repository
public class ServerRepository implements ServerRepositoryInt {
	private static Logger logger = Logger.getLogger(UserRepository.class);
	private EntityManager entityManager;

  	public ServerRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
  	@SuppressWarnings("unchecked")
	@Override
	public List<Server> getAll() {
		try{
			StringBuilder sql = new StringBuilder("SELECT s FROM Server s");
			Query q = entityManager.createQuery(sql.toString());	
			List<Server> result = (List<Server>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at ServerRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ServerRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public Server getById(Server obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT s FROM Server s where s.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", obj.getId());	
			return (Server)q.getResultList().get(0);
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at ServerRepository in getById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ServerRepository in getById() method \n "+ e);
			return null;
		}
	}

}
