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
import ctc.traccar.data.entities.Report;
import ctc.traccar.data.interfaces.ReportRepositoryInt;

@Repository
public class ReportRepository implements ReportRepositoryInt {

	private static Logger logger = Logger.getLogger(ReportRepository.class);
	private EntityManager entityManager;

  	public ReportRepository(){	
  		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
  		entityManager = emf.createEntityManager();
	}
  	
	@SuppressWarnings("unchecked")
	@Override
	public List<Report> getAllReports() {
		try{
			StringBuilder sql = new StringBuilder("SELECT r FROM Report r");
			Query q = entityManager.createQuery(sql.toString());
			List<Report> result = ( List<Report>)q.getResultList();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at ReportRepository in getAll() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ReportRepository in getAll() method \n "+ e);
			return null;
		}
	}

	@Override
	public Report getReportById(Report report) {
		try{
			StringBuilder sql = new StringBuilder("SELECT r FROM Report r WHERE r.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", report.getId());
			Report result = (Report)q.getSingleResult();
			return result;
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at ReportRepository in getReportById() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ReportRepository in getReportById() method \n "+ e);
			return null;
		}
	}

	@Override
	public List<Device> getDevicesByReport(Report report) {
		try{
			StringBuilder sql = new StringBuilder("SELECT r FROM Report r WHERE r.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", report.getId());
			Report result = (Report)q.getSingleResult();
			return result.getDevices();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at ReportRepository in getDevicesByReport() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ReportRepository in getDevicesByReport() method \n "+ e);
			return null;
		}
	}

	@Override
	public List<Geofence> getGeofenceByReport(Report report) {
		try{
			StringBuilder sql = new StringBuilder("SELECT r FROM Report r WHERE r.id = :id ");
			Query q = entityManager.createQuery(sql.toString());
			q.setParameter("id", report.getId());
			Report result = (Report)q.getSingleResult();
			return result.getGeofence();
		}catch(PersistenceException e){
			logger.error("[ERROR] PersistenceException - the following error ocurred at ReportRepository in getGeofenceByReport() method \n "+ e);
			return null;
		}catch(Exception e){
			logger.error("[ERROR] Uncaught Exception - the following error ocurred at ReportRepository in getGeofenceByReport() method \n "+ e);
			return null;
		}
	}

}
