package ctc.traccar.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.Statistic;

@Repository
public class StatisticRepository implements StatisticRepositoryInt {

	private static Logger logger = Logger.getLogger(UserRepository.class);
	private EntityManager entityManager;

  	public StatisticRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
  	@SuppressWarnings("unchecked")
	@Override
	public List<Statistic> getAll() {
		try{
			StringBuilder sql = new StringBuilder("SELECT s FROM Statistic s");
			Query q = entityManager.createQuery(sql.toString());	
			List<Statistic> result = (List<Statistic>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at StatisticRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at StatisticRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public Statistic getById(Statistic obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT s FROM Statistic s where s.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", obj.getId());	
			return (Statistic)q.getResultList().get(0);
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at StatisticRepository in getById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at StatisticRepository in getById() method \n "+ e);
			return null;
		}
	}

}
