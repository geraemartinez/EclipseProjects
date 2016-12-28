package ctc.traccar.business.interfaces;

import java.util.Set;

import ctc.traccar.api.vos.*;

public interface ReportServiceInt {
	
	public Set<ReportVo> getAllReports();
	public ReportVo getReportById(ReportVo report);
	public Set<DeviceVo> getDevicesByReport(ReportVo report);
	public Set<GeofenceVo> getGeofenceByReport(ReportVo report);
	
}
