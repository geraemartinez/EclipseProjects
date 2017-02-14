package ctc.traccar.web.rest.controllers;

import java.math.BigInteger;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ctc.traccar.api.vos.UserSettingVo;
import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.interfaces.UserSettingServiceInt;

@Controller
@RequestMapping("/api/UserSetting")
public class UserSettingController {
	

	private static Logger logger = Logger.getLogger(UserSettingController.class);
	
	@Autowired
	private UserSettingServiceInt service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getAllUserSetting(){
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {
			
			List<UserSettingVo> results =  service.getAllUserSetting();
			return new ResponseEntity<>(JsonParserHelper.toJson(results),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getAllUserSetting: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/{IdNumber}",method=RequestMethod.GET)
	public ResponseEntity<?> getUserSettingById(@PathVariable(value="IdNumber") String id){
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {
			
			UserSettingVo results =  service.getUserSettingById(new UserSettingVo(new BigInteger(id)));
			return new ResponseEntity<>(JsonParserHelper.toJson(results),responseHeaders,HttpStatus.OK);
			
		}catch(Exception e){
			String error = "[ERROR] Uncaught Exception - Internal server error at getUserSettingById: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
