package ctc.traccar.data.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.UiState;
import ctc.traccar.data.entities.User;
import ctc.traccar.data.interfaces.UiStateRepositoryInt;

@Repository
public class UiStateRepository implements UiStateRepositoryInt {

	private static Logger logger = Logger.getLogger(UiStateRepository.class);
	private EntityManager entityManager;

  	public UiStateRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<UiState> getAllUiState() {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM UiState u");
			Query q = entityManager.createQuery(sql.toString());
			List<UiState> result = (List<UiState>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UiStateRepository in getAllUiState() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UiStateRepository in getAllUiState() method \n "+ e);
			return null;
		}
	}

	@Override
	public UiState getUiStateById(UiState ui) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM UiState u WHERE u.id=:id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", ui.getId());
			UiState result = (UiState)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UiStateRepository in getUiStateById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UiStateRepository in getUiStateById() method \n "+ e);
			return null;
		}
	}

	@Override
	public User getUserByUiState(UiState ui) {
		try{
			StringBuilder sql = new StringBuilder("SELECT u FROM UiState u WHERE u.id=:id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", ui.getId());
			UiState result = (UiState)q.getSingleResult();
			return result.getUser();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at UiStateRepository in getUserByUiState() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at UiStateRepository in getUserByUiState() method \n "+ e);
			return null;
		}
	}

}
