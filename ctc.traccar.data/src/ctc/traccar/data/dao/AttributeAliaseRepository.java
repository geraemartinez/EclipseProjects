package ctc.traccar.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import ctc.traccar.data.entities.AttributeAliase;
import ctc.traccar.data.entities.Device;

@Repository
public class AttributeAliaseRepository implements AttributeAliaseRepositoryInt {

	private static Logger logger = Logger.getLogger(AttributeAliaseRepository.class);
	private EntityManager entityManager;

  	public AttributeAliaseRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<AttributeAliase> getAll() {
		try{
			StringBuilder sql = new StringBuilder("SELECT AA FROM AttributeAliase AA");
			Query q = entityManager.createQuery(sql.toString());
			return (List<AttributeAliase>)q.getResultList();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at AttributeAliaseRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at AttributeAliaseRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public AttributeAliase getById(AttributeAliase obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT AA FROM AttributeAliase AA where AA.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", obj.getId());	
			return (AttributeAliase)q.getResultList().get(0);
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at AttributeAliaseRepository in getById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at AttributeAliaseRepository in getById() method \n "+ e);
			return null;
		}
	}

	@Override
	public AttributeAliase getByAlias(AttributeAliase obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT AA FROM AttributeAliase AA where AA.alias = :alias");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("alias", obj.getAlias());	
			return (AttributeAliase)q.getResultList().get(0);
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at AttributeAliaseRepository in getByAlias() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at AttributeAliaseRepository in getByAlias() method \n "+ e);
			return null;
		}
	}

	@Override
	public AttributeAliase byDevice(Device obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT AA FROM AttributeAliase AA where AA.device.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", obj.getId());	
			return (AttributeAliase)q.getResultList().get(0);
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at AttributeAliaseRepository in byDevice() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at AttributeAliaseRepository in byDevice() method \n "+ e);
			return null;
		}
	}

	@Override
	public Device getDeviceByAlias(AttributeAliase obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT AA FROM AttributeAliase AA where AA.alias = :alias");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("alias", obj.getAlias());
			AttributeAliase result = (AttributeAliase)q.getResultList().get(0);
			return result.getDevice();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at AttributeAliaseRepository in getDeviceByAlias() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at AttributeAliaseRepository in getDeviceByAlias() method \n "+ e);
			return null;
		}
	}

	@Override
	public Device getDeviceByIdAttributeAliase(AttributeAliase obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT AA FROM AttributeAliase AA where AA.id = :id");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", obj.getId());
			AttributeAliase result = (AttributeAliase)q.getResultList().get(0);
			return result.getDevice();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at AttributeAliaseRepository in getDeviceByIdAttributeAliase() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at AttributeAliaseRepository in getDeviceByIdAttributeAliase() method \n "+ e);
			return null;
		}
	}

	@Override
	public Device getDeviceByAliasAttributeAliase(AttributeAliase obj) {
		try{
			StringBuilder sql = new StringBuilder("SELECT AA FROM AttributeAliase AA where AA.alias = :alias");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("alias", obj.getAlias());
			AttributeAliase result = (AttributeAliase)q.getResultList().get(0);
			return result.getDevice();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceExceptio - the following error ocurred at AttributeAliaseRepository in getDeviceByAliasAttributeAliase() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at AttributeAliaseRepository in getDeviceByAliasAttributeAliase() method \n "+ e);
			return null;
		}
	}

}
