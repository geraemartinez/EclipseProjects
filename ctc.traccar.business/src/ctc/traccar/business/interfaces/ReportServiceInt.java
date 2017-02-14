package ctc.traccar.business.interfaces;

import java.util.List;

import ctc.traccar.api.vos.*;

public interface ReportServiceInt {
	
	public List<ReportVo> getAllReports();
	public ReportVo getReportById(ReportVo report);
	public List<DeviceVo> getDevicesByReport(ReportVo report);
	public List<GeofenceVo> getGeofenceByReport(ReportVo report);
	
}
