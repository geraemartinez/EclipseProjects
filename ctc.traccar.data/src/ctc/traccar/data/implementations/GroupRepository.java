package ctc.traccar.data.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.Group;
import ctc.traccar.data.entities.User;
import ctc.traccar.data.interfaces.GroupRepositoryInt;

@Repository
public class GroupRepository implements GroupRepositoryInt {
	
	private static Logger logger = Logger.getLogger(GroupRepository.class);
	private EntityManager entityManager;

  	public GroupRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<Group> getAllGroups() {
		try{
			StringBuilder sql = new StringBuilder("SELECT g FROM Group g");
			Query q = entityManager.createQuery(sql.toString());
			List<Group> result = (List<Group>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at GroupRepository in getAllGroups() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GroupRepository in getAllGroups() method \n "+ e);
			return null;
		}
	}

	@Override
	public List<Group> getChildGroups(Group group) {
		
		try{
			StringBuilder sql = new StringBuilder("SELECT g FROM Group g WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", group.getId());
			Group result = (Group)q.getSingleResult();
			return result.getGroups();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at GroupRepository in getChildGroups() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GroupRepository in getChildGroups() method \n "+ e);
			return null;
		}
	}

	@Override
	public List<User> getUsers(Group group) {
		try{
			StringBuilder sql = new StringBuilder("SELECT g FROM Group g WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", group.getId());
			Group result = (Group)q.getSingleResult();
			return result.getUsers();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at GroupRepository in getUsers() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GroupRepository in getUsers() method \n "+ e);
			return null;
		}
	}

	@Override
	public Group getGroupById(Group group) {
		try{
			StringBuilder sql = new StringBuilder("SELECT g FROM Group g WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", group.getId());
			Group result = (Group)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at GroupRepository in getGroupById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GroupRepository in getGroupById() method \n "+ e);
			return null;
		}
	}

	@Override
	public Group getParentGroup(Group group) {
		try{
			StringBuilder sql = new StringBuilder("SELECT g FROM Group g WHERE d.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", group.getId());
			Group result = (Group)q.getSingleResult();
			return result.getParent();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at GroupRepository in getParentGroup() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at GroupRepository in getParentGroup() method \n "+ e);
			return null;
		}
	}

}
