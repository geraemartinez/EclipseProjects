package ctc.traccar.data.implementations;

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
import ctc.traccar.data.interfaces.PositionRepositoryInt;

@Repository
public class PositionRepository implements PositionRepositoryInt {

	private static Logger logger = Logger.getLogger(PositionRepository.class);
	private EntityManager entityManager;
	private static final int LIMIT = 2000;

  	public PositionRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<Position> getAllPosition() {
		try{
			
			StringBuilder sql = new StringBuilder("SELECT p FROM Position p");
			Query q = entityManager.createQuery(sql.toString());
			q.setMaxResults(LIMIT);
			List<Position> result = (List<Position>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at PositionRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at PositionRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public Position getPosition(Position position) {
		try{
			StringBuilder sql = new StringBuilder("SELECT p FROM Position p WHERE p.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", position.getId());
			Position result = (Position)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at PositionRepository in getPosition() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at PositionRepository in getPosition() method \n "+ e);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Position> getPositionsByDevice(Device device) {
		try{
			StringBuilder sql = new StringBuilder("SELECT p FROM Position p WHERE p.deviceId = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", device.getId());
			q.setMaxResults(LIMIT);
			List<Position> result = (List<Position>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at PositionRepository in getPositionsByDevice() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at PositionRepository in getPositionsByDevice() method \n "+ e);
			return null;
		}
	}

	@Override
	public Device getDeviceByPosition(Position position) {
		try{
			StringBuilder sql = new StringBuilder("SELECT p FROM Position p WHERE p.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", position.getId());
			Position result = (Position)q.getSingleResult();
			return result.getDevice();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at PositionRepository in getDeviceByPosition() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at PositionRepository in getDeviceByPosition() method \n "+ e);
			return null;
		}
	}

}
