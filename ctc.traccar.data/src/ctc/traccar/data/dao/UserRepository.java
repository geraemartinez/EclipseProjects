package ctc.traccar.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.User;

@Repository
public class UserRepository implements UserRepositoryInt {
	
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(UserRepository.class);
	private EntityManager entityManager;

  	public UserRepository(){	
  
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		StringBuilder sql = new StringBuilder("SELECT u FROM User u");
		Query q = entityManager.createQuery(sql.toString());
		return (List<User>)q.getResultList();
	}

}

