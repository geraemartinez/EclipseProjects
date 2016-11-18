package ctc.traccar.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import ctc.traccar.data.entities.Device;
import ctc.traccar.data.entities.Position;

@Repository
public class PositionRepository implements PositionRepositoryInt {
	private static Logger logger = Logger.getLogger(UserRepository.class);
	private EntityManager entityManager;

  	public PositionRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<Position> getAll() {
		try{
			StringBuilder sql = new StringBuilder("SELECT p FROM Position p");
			Query q = entityManager.createQuery(sql.toString());
			List<Position> result = (List<Position>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at PositionRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at PositionRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public Position getById(Position obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT p FROM Position p where p.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", obj.getId());	
			return (Position)q.getResultList().get(0);
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at PositionRepository in getById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at PositionRepository in getById() method \n "+ e);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Position> getByIdDevice(Position obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT p FROM Position p where p.deviceid = :deviceid ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("deviceid", obj.getDeviceid());	
			return (List<Position>)q.getResultList();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at PositionRepository in getByIdDevice() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at PositionRepository in getByIdDevice() method \n "+ e);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Position> getByIdDevice(Device obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT p FROM Position p where p.device.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", obj.getId());	
			return (List<Position>)q.getResultList();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at PositionRepository in getByIdDevice() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at PositionRepository in getByIdDevice() method \n "+ e);
			return null;
		}
	}


}
