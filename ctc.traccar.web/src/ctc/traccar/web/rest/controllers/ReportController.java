package ctc.traccar.web.rest.controllers;

import java.math.BigInteger;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ctc.traccar.api.vos.DeviceVo;
import ctc.traccar.api.vos.GeofenceVo;
import ctc.traccar.api.vos.ReportVo;
import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.interfaces.ReportServiceInt;

@RestController
@RequestMapping("/api/Report")
public class ReportController {
	
	private static Logger logger = Logger.getLogger(ReportController.class);

	@Autowired  ReportServiceInt service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getAllReports(){
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			List<ReportVo> vos =  service.getAllReports();
			return new ResponseEntity<>(JsonParserHelper.toJson(vos),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getAllReports: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}
	
	@RequestMapping(value="/{IdNumber}",method=RequestMethod.GET)
	public ResponseEntity<?> getReportById(@PathVariable(value="IdNumber") String id){
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			ReportVo vo =  service.getReportById(new ReportVo(new BigInteger(id)));
			return new ResponseEntity<>(JsonParserHelper.toJson(vo),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getReportById: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}
	
	@RequestMapping(value="/{IdNumber}/Devices",method=RequestMethod.GET)
	public ResponseEntity<?> getDevicesByReport(@PathVariable(value="IdNumber") String id){
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			List<DeviceVo> vos =  service.getDevicesByReport(new ReportVo(new BigInteger(id)));
			return new ResponseEntity<>(JsonParserHelper.toJson(vos),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getDevicesByReport: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
		
	}
	
	@RequestMapping(value="/{IdNumber}/Geofences",method=RequestMethod.GET)
	public ResponseEntity<?> getGeofenceByReport(@PathVariable(value="IdNumber") String id){
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			List<GeofenceVo> vos =  service.getGeofenceByReport(new ReportVo(new BigInteger(id)));
			return new ResponseEntity<>(JsonParserHelper.toJson(vos),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getGeofenceByReport: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}

}
