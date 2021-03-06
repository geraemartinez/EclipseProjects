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
import ctc.traccar.api.vos.SensorVo;
import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.interfaces.SensorServiceInt;

@RestController
@RequestMapping("/api/Sensor")
public class SensorController {
	private static Logger logger = Logger.getLogger(SensorController.class);

	@Autowired  SensorServiceInt service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getAllSensors(){
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			List<SensorVo> vos =  service.getAllSensors();
			return new ResponseEntity<>(JsonParserHelper.toJson(vos),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getAllSensors: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
		
	}
	
	@RequestMapping(value="/{IdNumber}",method=RequestMethod.GET)
	public ResponseEntity<?> getSensorById(@PathVariable(value="IdNumber") String id){
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			SensorVo vos =  service.getSensorById(new SensorVo(new BigInteger(id)));
			return new ResponseEntity<>(JsonParserHelper.toJson(vos),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getSensorById: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
		
	}
	
	@RequestMapping(value="/{IdNumber}/Device",method=RequestMethod.GET)
	public ResponseEntity<?> getDeviceBySensor(@PathVariable(value="IdNumber") String id){
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			DeviceVo vos =  service.getDeviceBySensor(new SensorVo(new BigInteger(id)));
			return new ResponseEntity<>(JsonParserHelper.toJson(vos),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getDeviceBySensor: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
		
	}
}
