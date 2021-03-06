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
import ctc.traccar.data.entities.Geofence;
import ctc.traccar.data.interfaces.GeofenceRepositoryInt;

@Repository
public class GeofenceRepository implements GeofenceRepositoryInt {
	
	private static Logger logger = Logger.getLogger(GeofenceRepository.class);
	private EntityManager entityManager;

  	public GeofenceRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<Geofence> getAllGeofences() {
		try{
			StringBuilder sql = new StringBuilder("SELECT g FROM Geofence g");
			Query q = entityManager.createQuery(sql.toString());
			List<Geofence> result = (List<Geofence>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at GeofenceRepository in getAllGeofences() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GeofenceRepository in getAllGeofences() method \n "+ e);
			return null;
		}
	}

	@Override
	public Geofence getGeofenceById(Geofence geo) {
		try{
			StringBuilder sql = new StringBuilder("SELECT g FROM Geofence g WHERE g.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", geo.getId());
			Geofence result = (Geofence)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at GeofenceRepository in getGeofenceById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GeofenceRepository in getGeofenceById() method \n "+ e);
			return null;
		}
	}

	@Override
	public List<Device> getDevicesGeofence(Geofence geo) {
		try{
			StringBuilder sql = new StringBuilder("SELECT g FROM Geofence g WHERE g.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", geo.getId());
			Geofence result = (Geofence)q.getSingleResult();
			return result.getDevices();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at GeofenceRepository in getDevicesGeofence() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GeofenceRepository in getDevicesGeofence() method \n "+ e);
			return null;
		}
	}

}
