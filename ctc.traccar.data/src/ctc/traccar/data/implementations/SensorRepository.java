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
import ctc.traccar.data.entities.Sensor;
import ctc.traccar.data.interfaces.SensorRepositoryInt;

@Repository
public class SensorRepository implements SensorRepositoryInt {
	private static Logger logger = Logger.getLogger(SensorRepository.class);
	private EntityManager entityManager;

  	public SensorRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
	
  	@SuppressWarnings("unchecked")
	@Override
	public List<Sensor> getAllSensors() {
		try{
			StringBuilder sql = new StringBuilder("SELECT s FROM Sensor s");
			Query q = entityManager.createQuery(sql.toString());
			List<Sensor> result = (List<Sensor>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at SensorRepository in getAllSensors() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at SensorRepository in getAllSensors() method \n "+ e);
			return null;
		}
	}

	@Override
	public Sensor getSensorById(Sensor sensor) {
		try{
			StringBuilder sql = new StringBuilder("SELECT s FROM Sensor s WHERE s.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", sensor.getId());
			Sensor result = (Sensor)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at SensorRepository in getAllSensors() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at SensorRepository in getAllSensors() method \n "+ e);
			return null;
		}
	}

	@Override
	public Device getDeviceBySensor(Sensor sensor) {
		try{
			StringBuilder sql = new StringBuilder("SELECT s FROM Sensor s WHERE s.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", sensor.getId());
			Sensor result = (Sensor)q.getSingleResult();
			return result.getDevice();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at SensorRepository in getAllSensors() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at SensorRepository in getAllSensors() method \n "+ e);
			return null;
		}
	}

}
