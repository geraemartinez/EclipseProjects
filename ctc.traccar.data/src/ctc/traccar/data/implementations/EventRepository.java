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
import ctc.traccar.data.entities.Event;
import ctc.traccar.data.entities.Geofence;
import ctc.traccar.data.entities.Maintenance;
import ctc.traccar.data.entities.Position;
import ctc.traccar.data.interfaces.EventRepositoryInt;

@Repository
public class EventRepository implements EventRepositoryInt {

	private static Logger logger = Logger.getLogger(EventRepository.class);
	private EntityManager entityManager;

  	public EventRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<Event> getAllEvents() {
		try{
			StringBuilder sql = new StringBuilder("SELECT e FROM Event e");
			Query q = entityManager.createQuery(sql.toString());
			List<Event> result = (List<Event>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at EvenRepository in getAllEvents() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at EvenRepository in getAllEvents() method \n "+ e);
			return null;
		}
	}

	@Override
	public Event getEventById(Event event) {
		try{
			StringBuilder sql = new StringBuilder("SELECT e FROM Event e WHERE e.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			Event result = (Event)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at EvenRepository in getEventById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at EvenRepository in getEventById() method \n "+ e);
			return null;
		}
	}

	@Override
	public Device getDeviceEvent(Event event) {
		try{
			StringBuilder sql = new StringBuilder("SELECT e FROM Event e WHERE e.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			Event result = (Event)q.getSingleResult();
			return result.getDevice();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at EvenRepository in getDeviceEvent() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at EvenRepository in getDeviceEvent() method \n "+ e);
			return null;
		}
	}

	@Override
	public Geofence getGeofenceEvent(Event event) {
		try{
			StringBuilder sql = new StringBuilder("SELECT e FROM Event e WHERE e.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			Event result = (Event)q.getSingleResult();
			return result.getGeofence();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at EvenRepository in getGeofenceEvent() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at EvenRepository in getGeofenceEvent() method \n "+ e);
			return null;
		}
	}

	@Override
	public Maintenance getMaintenanceEvent(Event event) {
		try{
			StringBuilder sql = new StringBuilder("SELECT e FROM Event e WHERE e.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			Event result = (Event)q.getSingleResult();
			return result.getMaintenance();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at EvenRepository in getMaintenanceEvent() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at EvenRepository in getMaintenanceEvent() method \n "+ e);
			return null;
		}
	}

	@Override
	public Position getPositionEvent(Event event) {
		try{
			StringBuilder sql = new StringBuilder("SELECT e FROM Event e WHERE e.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			Event result = (Event)q.getSingleResult();
			return result.getPosition();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at EvenRepository in getPositionEvent() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at EvenRepository in getPositionEvent() method \n "+ e);
			return null;
		}
	}

}
