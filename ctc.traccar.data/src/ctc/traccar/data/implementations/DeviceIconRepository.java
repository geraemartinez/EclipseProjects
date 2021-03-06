package ctc.traccar.data.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.DeviceIcon;
import ctc.traccar.data.entities.Picture;
import ctc.traccar.data.interfaces.DeviceIconRepositoryInt;

@Repository
public class DeviceIconRepository implements DeviceIconRepositoryInt {

	private static Logger logger = Logger.getLogger(DeviceIconRepository.class);
	private EntityManager entityManager;

  	public DeviceIconRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<DeviceIcon> getAllDeviceIcon() {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM DeviceIcon d");
			Query q = entityManager.createQuery(sql.toString());
			List<DeviceIcon> result = (List<DeviceIcon>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceIconRepository in getAllDeviceIcon() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceIconRepository in getAllDeviceIcon() method \n "+ e);
			return null;
		}
	}

	@Override
	public DeviceIcon getDeviceIconById(DeviceIcon devIcon) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM DeviceIcon d WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", devIcon.getId());
			DeviceIcon result = (DeviceIcon) q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceIconRepository in getDeviceIconById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceIconRepository in getDeviceIconById() method \n "+ e);
			return null;
		}
	}

	@Override
	public Picture getDefaultIconByDeviceIcon(DeviceIcon devIcon) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM DeviceIcon d WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", devIcon.getId());
			DeviceIcon result = (DeviceIcon) q.getSingleResult();
			return result.getDefaultIcon();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceIconRepository in getDefaultIconByDeviceIcon() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceIconRepository in getDefaultIconByDeviceIcon() method \n "+ e);
			return null;
		}
	}

	@Override
	public Picture getofflineIconByDeviceIcon(DeviceIcon devIcon) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM DeviceIcon d WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", devIcon.getId());
			DeviceIcon result = (DeviceIcon) q.getSingleResult();
			return result.getOfflineIcon();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceIconRepository in getofflineIconByDeviceIcon() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceIconRepository in getofflineIconByDeviceIcon() method \n "+ e);
			return null;
		}
	}

	@Override
	public Picture getselectedIconByDeviceIcon(DeviceIcon devIcon) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM DeviceIcon d WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", devIcon.getId());
			DeviceIcon result = (DeviceIcon) q.getSingleResult();
			return result.getSelectedIcon();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceIconRepository in getselectedIconByDeviceIcon() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceIconRepository in getselectedIconByDeviceIcon() method \n "+ e);
			return null;
		}
	}

}
