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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import ctc.traccar.api.vos.GeofenceVo;
import ctc.traccar.api.vos.ReportVo;
import ctc.traccar.api.vos.UserSettingVo;
import ctc.traccar.api.vos.UserVo;
import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.interfaces.UserServiceInt;

@RestController
@RequestMapping("/api/User")
public class UserController {

		private static Logger logger = Logger.getLogger(UserController.class);
		
		@Autowired
		private UserServiceInt userService;
		
		@ModelAttribute("UserVo")
	    public UserVo getUserVo(){
	        return new UserVo();
	    }
		
		
		@RequestMapping(value="/Email/{email}",method=RequestMethod.GET)
		public  ResponseEntity<?> GetUserByEmail(@PathVariable(value="email") String email) {			
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {
						
				UserVo vo = new UserVo(email);
				List<UserVo> res = userService.getByEmail(vo);
				
				return new ResponseEntity<>(JsonParserHelper.toJson(res),responseHeaders,HttpStatus.OK);
			
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at GetUserById: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
			}
					
		}
		
		@RequestMapping(value="/Username/{login}",method=RequestMethod.GET)
		public  ResponseEntity<?> GetUserByLogin(@PathVariable(value="login") String login) {			
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {
						
				UserVo vo = new UserVo();
				vo.setLogin(login);
				UserVo res = userService.getByLogin(vo);
				
				return new ResponseEntity<>(JsonParserHelper.toJson(res),responseHeaders,HttpStatus.OK);
			
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at GetUserById: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
			}
					
		}
		
		@RequestMapping(value="/{IdNumber}",method=RequestMethod.GET)
		public ResponseEntity<?> GetUserById(@PathVariable(value="IdNumber") String id) {
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {

				BigInteger Id = new BigInteger(id);
				UserVo vo = new UserVo(Id);				
				vo =  userService.getById(vo);
				
				return new ResponseEntity<>(JsonParserHelper.toJson(vo),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at GetUserById: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
			}
				
		}
		
		@RequestMapping(method=RequestMethod.GET)		
		public ResponseEntity<?> GetAllUsers() {
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {
				
				List<UserVo> result =  userService.getAll();
				return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders,HttpStatus.OK);
			
			}catch(Exception e){

				String error="[ERROR] Uncaught Exception - Internal server error at GetAllUsers: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
					
		}
		
		@RequestMapping(value="/{IdNumber}/Geofences",method=RequestMethod.GET)
		public ResponseEntity<?> GetUserGeofences(@PathVariable(value="IdNumber") String id) {
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {
				
				BigInteger Id = new BigInteger(id);
				UserVo vo = new UserVo(Id);
				List<GeofenceVo> results =  userService.getGeofences(vo);
				return new ResponseEntity<>(JsonParserHelper.toJson(results),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				
				String error ="[ERROR] Uncaught Exception - Internal server error at GetUserGeofences: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
			}
					
		}
		
		@RequestMapping(value="/{IdNumber}/Reports",method=RequestMethod.GET)
		public ResponseEntity<?> GetUserReports(@PathVariable(value="IdNumber") String id) {			
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {
				
				BigInteger Id = new BigInteger(id);
				UserVo vo = new UserVo(Id);
				List<ReportVo> results =  userService.getReports(vo);
				return new ResponseEntity<>(JsonParserHelper.toJson(results),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				
				String error = "[ERROR] Uncaught Exception - Internal server error at GetUserReports: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
			}
					
		}
		
		@RequestMapping(value="/{IdNumber}/UserSettings",method=RequestMethod.GET)	
		public ResponseEntity<?> GetUserSettings(@PathVariable(value="IdNumber") String id) {
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {
				
				BigInteger Id = new BigInteger(id);
				UserVo vo = new UserVo(Id);
				UserSettingVo results =  userService.getUserSetting(vo);
				return new ResponseEntity<>(JsonParserHelper.toJson(results),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at GetUserSettings: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
			}
					
		}
		
		
		@RequestMapping(value="/Login",method=RequestMethod.POST)
		public ResponseEntity<?> GetUserAccess(@RequestBody String json) {
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			Gson gson = new Gson();
			UserVo vo = new UserVo();
			
			try {

				vo = gson.fromJson(json,UserVo.class);
			    UserVo result = userService.login(vo);
				return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders, HttpStatus.OK);
				
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at GetUserAccess: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
}
