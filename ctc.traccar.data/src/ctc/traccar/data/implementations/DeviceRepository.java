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
import ctc.traccar.data.interfaces.DeviceRepositoryInt;

@Repository
class DeviceRepository implements DeviceRepositoryInt {
	private static Logger logger = Logger.getLogger(DeviceRepository.class);
	private EntityManager entityManager;

  	public DeviceRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<Device> getAll() {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM Device u");
			Query q = entityManager.createQuery(sql.toString());
			List<Device> result = (List<Device>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at DeviceRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at DeviceRepository in getAll() method \n "+ e);
			return null;
		}
	}
	
}