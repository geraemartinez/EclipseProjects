package ctc.traccar.data.interfaces;

import java.util.List;

import ctc.traccar.data.entities.Device;
import ctc.traccar.data.entities.Geofence;
import ctc.traccar.data.entities.Report;

public interface ReportRepositoryInt {
	
	public List<Report> getAllReports();
	public Report getReportById(Report report);
	public List<Device> getDevicesByReport(Report report);
	public List<Geofence> getGeofenceByReport(Report report);
	
}
