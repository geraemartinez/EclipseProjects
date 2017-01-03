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
import ctc.traccar.data.entities.DeviceIcon;
import ctc.traccar.data.entities.Group;
import ctc.traccar.data.entities.Picture;
import ctc.traccar.data.entities.Position;
import ctc.traccar.data.entities.User;
import ctc.traccar.data.interfaces.DeviceRepositoryInt;

@Repository
public class DeviceRepository implements DeviceRepositoryInt {
	private static Logger logger = Logger.getLogger(DeviceRepository.class);
	private EntityManager entityManager;

  	public DeviceRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<Device> getAllDevices() {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM Device d");
			Query q = entityManager.createQuery(sql.toString());
			List<Device> result = (List<Device>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public Device getDeviceById(Device device) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM Device d WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", device.getId());
			Device result = (Device)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceRepository in getDeviceById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceRepository in getDeviceById() method \n "+ e);
			return null;
		}
	}

	@Override
	public User getOwnerDevice(Device device) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM Device d WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", device.getId());
			Device result = (Device)q.getSingleResult();
			return result.getOwner();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceRepository in getOwner() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceRepository in getOwner() method \n "+ e);
			return null;
		}
	}

	@Override
	public DeviceIcon getDeviceIcon(Device device) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM Device d WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", device.getId());
			Device result = (Device)q.getSingleResult();
			return result.getDeviceIcon();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceRepository in getDeviceIcon() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceRepository in getDeviceIcon() method \n "+ e);
			return null;
		}
	}

	@Override
	public Picture getPictureDevice(Device device) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM Device d WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", device.getId());
			Device result = (Device)q.getSingleResult();
			return result.getPicture();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceRepository in getPicture() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceRepository in getPicture() method \n "+ e);
			return null;
		}
	}

	@Override
	public Position getLastPositionDevice(Device device) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM Device d WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", device.getId());
			Device result = (Device)q.getSingleResult();
			return result.getLastPosition();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceRepository in getLastPosition() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceRepository in getLastPosition() method \n "+ e);
			return null;
		}
	}

	@Override
	public Group getGroupDevice(Device device) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM Device d WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", device.getId());
			Device result = (Device)q.getSingleResult();
			return result.getGroup();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceRepository in getGroup() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceRepository in getGroup() method \n "+ e);
			return null;
		}
	}

	@Override
	public Device getDeviceByUniqueId(Device device) {
		try{
			StringBuilder sql = new StringBuilder("SELECT d FROM Device d WHERE d.uniqueId = :uniqueId");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("uniqueId", device.getId());
			Device result = (Device)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at DeviceRepository in getDeviceByUniqueId() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceRepository in getDeviceByUniqueId() method \n "+ e);
			return null;
		}
	}
	
}
