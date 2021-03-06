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

import ctc.traccar.api.vos.NotificationSettingVo;
import ctc.traccar.api.vos.UserVo;
import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.interfaces.NotificationSettingServiceInt;

@RestController
@RequestMapping("/api/NotificationSetting")
public class NotificationSettingController {

	private static Logger logger = Logger.getLogger(NotificationSettingController.class);

	@Autowired NotificationSettingServiceInt service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getAllNotificationSetting(){
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			List<NotificationSettingVo> vos =  service.getAllNotificationSetting();
			return new ResponseEntity<>(JsonParserHelper.toJson(vos),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getAllNotificationSetting: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}
	
	@RequestMapping(value="/{IdNumber}",method=RequestMethod.GET)
	public ResponseEntity<?> getNotificationSettingById(@PathVariable(value="IdNumber") String id){
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			NotificationSettingVo vo = new NotificationSettingVo(new BigInteger(id));
			vo =  service.getNotificationSettingById(vo);
			return new ResponseEntity<>(JsonParserHelper.toJson(vo),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getNotificationSettingById: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}
	
	@RequestMapping(value="/User/{IdNumber}",method=RequestMethod.GET)
	public ResponseEntity<?> getNotificationSettingByUser(@PathVariable(value="IdNumber") String id){
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			UserVo vo = new UserVo(new BigInteger(id));
			NotificationSettingVo result =  service.getNotificationSettingByUser(vo);
			return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getNotificationSettingByUser: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}
	
	@RequestMapping(value="/{IdNumber}/User",method=RequestMethod.GET)
	public ResponseEntity<?> getNotificationSettingUser(@PathVariable(value="IdNumber") String id){
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {

			NotificationSettingVo vo = new NotificationSettingVo(new BigInteger(id));
			UserVo result =  service.getNotificationSettingUser(vo);
			return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getNotificationSettingUser: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}
}
