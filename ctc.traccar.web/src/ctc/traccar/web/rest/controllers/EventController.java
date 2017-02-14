package ctc.traccar.web.rest.controllers;

import java.math.BigInteger;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ctc.traccar.api.vos.DeviceVo;
import ctc.traccar.api.vos.EventVo;
import ctc.traccar.api.vos.GeofenceVo;
import ctc.traccar.api.vos.MaintenanceVo;
import ctc.traccar.api.vos.PositionVo;
import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.interfaces.EventServiceInt;


@RestController
@RequestMapping("/api/Event")
public class EventController {

	private static Logger logger = Logger.getLogger(EventController.class);
	
	@Autowired
	private EventServiceInt service;
	
	@ModelAttribute("DeviceVo")
    public EventVo getEventVo(){
        return new EventVo();
    }
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getAllEvents() {
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			List<EventVo> vo =  service.getAllEvents();
			return new ResponseEntity<>(JsonParserHelper.toJson(vo),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getGroupDevice: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}

	@RequestMapping(value="/{IdNumber}",method=RequestMethod.GET)
	public ResponseEntity<?> getEventById(@PathVariable(value="IdNumber") String id) {
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			EventVo event = new EventVo(new BigInteger(id));
			EventVo result = service.getEventById(event);
			return new ResponseEntity<>(JsonParserHelper.toJson( result),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getGroupDevice: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}

	@RequestMapping(value="/{IdNumber}/Device",method=RequestMethod.GET)
	public ResponseEntity<?> getDeviceEvent(@PathVariable(value="IdNumber") String id) {
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			EventVo event = new EventVo(new BigInteger(id));
			DeviceVo result = service.getDeviceEvent(event);
			return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getGroupDevice: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}

	@RequestMapping(value="/{IdNumber}/Geofence",method=RequestMethod.GET)
	public ResponseEntity<?> getGeofenceEvent(@PathVariable(value="IdNumber") String id) {
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			EventVo event = new EventVo(new BigInteger(id));
			GeofenceVo result = service.getGeofenceEvent(event);
			return new ResponseEntity<>(JsonParserHelper.toJson( result),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getGroupDevice: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}

	@RequestMapping(value="/{IdNumber}/Maintenance",method=RequestMethod.GET)
	public ResponseEntity<?> getMaintenanceEvent(@PathVariable(value="IdNumber") String id) {
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			EventVo event = new EventVo(new BigInteger(id));
			MaintenanceVo result = service.getMaintenanceEvent(event);
			return new ResponseEntity<>(JsonParserHelper.toJson( result),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getGroupDevice: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}

	@RequestMapping(value="/{IdNumber}/Position",method=RequestMethod.GET)
	public ResponseEntity<?> getPositionEvent(@PathVariable(value="IdNumber") String id) {
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {
			EventVo event = new EventVo(new BigInteger(id));
			PositionVo result = service.getPositionEvent(event);
			return new ResponseEntity<>(JsonParserHelper.toJson( result),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getGroupDevice: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}

}
