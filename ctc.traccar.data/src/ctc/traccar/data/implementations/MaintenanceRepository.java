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
import ctc.traccar.data.entities.Maintenance;
import ctc.traccar.data.interfaces.MaintenanceRepositoryInt;

@Repository
public class MaintenanceRepository implements MaintenanceRepositoryInt {

	private EntityManager entityManager;
	private static Logger logger = Logger.getLogger(MaintenanceRepository.class);

  	public MaintenanceRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<Maintenance> getAllMaintenance() {
		try{
			StringBuilder sql = new StringBuilder("SELECT m FROM Maintenance m");
			Query q = entityManager.createQuery(sql.toString());
			List<Maintenance> result = (List<Maintenance>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at MaintenanceRepository in getAllMaintenance() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at MaintenanceRepository in getAllMaintenance() method \n "+ e);
			return null;
		}
	}

	@Override
	public Maintenance getMaintenanceById(Maintenance m) {
		try{
			StringBuilder sql = new StringBuilder("SELECT m FROM Maintenance m WHERE m.id=:id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", m.getId());
			Maintenance result = (Maintenance)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at MaintenanceRepository in getMaintenanceById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at MaintenanceRepository in getMaintenanceById() method \n "+ e);
			return null;
		}
	}

	@Override
	public Device getDeviceOfMaintenance(Maintenance m) {
		try{
			StringBuilder sql = new StringBuilder("SELECT m FROM Maintenance m WHERE m.id=:id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", m.getId());
			Maintenance result = (Maintenance)q.getSingleResult();
			return result.getDevice();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at MaintenanceRepository in getDeviceOfMaintenance() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at MaintenanceRepository in getDeviceOfMaintenance() method \n "+ e);
			return null;
		}
	}

}
