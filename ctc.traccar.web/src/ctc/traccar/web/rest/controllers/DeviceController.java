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

import ctc.traccar.api.vos.DeviceIconVo;
import ctc.traccar.api.vos.DeviceVo;
import ctc.traccar.api.vos.GroupVo;
import ctc.traccar.api.vos.PictureVo;
import ctc.traccar.api.vos.PositionVo;
import ctc.traccar.api.vos.UserVo;

import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.interfaces.DeviceServiceInt;

@RestController
@RequestMapping("/api/Device")
public class DeviceController {

		private static Logger logger = Logger.getLogger(DeviceController.class);
		
		@Autowired
		private DeviceServiceInt deviceService;
		
		@ModelAttribute("DeviceVo")
	    public DeviceVo getDeviceVo(){
	        return new DeviceVo();
	    }
		
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<?> getAllDevices() {
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {
				
				List<DeviceVo> result =  deviceService.getAllDevices();
				return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders,HttpStatus.OK);
			
			}catch(Exception e){

				String error="[ERROR] Uncaught Exception - Internal server error at getAllDevices: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		@RequestMapping(value="/{IdNumber}",method=RequestMethod.GET)
		public ResponseEntity<?> getDeviceById(@PathVariable(value="IdNumber") String id) {
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {

				BigInteger Id = new BigInteger(id);
				DeviceVo vo = new DeviceVo(Id);				
				vo =  deviceService.getDeviceById(vo);
				
				return new ResponseEntity<>(JsonParserHelper.toJson(vo),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at getDeviceById: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
			}
		}

		@RequestMapping(value="/IMEI/{IdNumber}",method=RequestMethod.GET)
		public ResponseEntity<?> getDeviceByUniqueId(@PathVariable(value="IdNumber") String id) {

			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {

				DeviceVo vo = new DeviceVo();	
				vo.setUniqueId(id);
				vo =  deviceService.getDeviceByUniqueId(vo);
				
				return new ResponseEntity<>(JsonParserHelper.toJson(vo),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at getDeviceByUniqueId: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
			}
		}

		@RequestMapping(value="/{IdNumber}/Owner",method=RequestMethod.GET)
		public ResponseEntity<?> getOwnerDevice(@PathVariable(value="IdNumber") String id) {
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {

				BigInteger Id = new BigInteger(id);
				DeviceVo vo = new DeviceVo(Id);				
				UserVo user =  deviceService.getOwnerDevice(vo);
				
				return new ResponseEntity<>(JsonParserHelper.toJson(user),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at getOwnerDevice: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
			}
		}

		@RequestMapping(value="/{IdNumber}/Icon",method=RequestMethod.GET)
		public ResponseEntity<?> getDeviceIcon(@PathVariable(value="IdNumber") String id) {
			
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {

				BigInteger Id = new BigInteger(id);
				DeviceVo vo = new DeviceVo(Id);				
				DeviceIconVo icon =  deviceService.getDeviceIcon(vo);
				
				return new ResponseEntity<>(JsonParserHelper.toJson( icon),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at getDeviceIcon: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
			}
			
		}

		@RequestMapping(value="/{IdNumber}/Picture",method=RequestMethod.GET)
		public ResponseEntity<?> getPictureDevice(@PathVariable(value="IdNumber") String id) {

			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {

				BigInteger Id = new BigInteger(id);
				DeviceVo vo = new DeviceVo(Id);				
				PictureVo icon =  deviceService.getPictureDevice(vo);
				
				return new ResponseEntity<>(JsonParserHelper.toJson( icon),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at getPictureDevice: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
			}
		}

		@RequestMapping(value="/{IdNumber}/LastPosition",method=RequestMethod.GET)
		public ResponseEntity<?> getLastPositionDevice(@PathVariable(value="IdNumber") String id) {
			

			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {

				BigInteger Id = new BigInteger(id);
				DeviceVo vo = new DeviceVo(Id);				
				PositionVo pvo =  deviceService.getLastPositionDevice(vo);
				
				return new ResponseEntity<>(JsonParserHelper.toJson( pvo),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at getLastPositionDevice: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
			}
		}

		@RequestMapping(value="/{IdNumber}/Group",method=RequestMethod.GET)
		public ResponseEntity<?> getGroupDevice(@PathVariable(value="IdNumber") String id) {

			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=utf-8");
			
			try {

				BigInteger Id = new BigInteger(id);
				DeviceVo vo = new DeviceVo(Id);				
				GroupVo gvo =  deviceService.getGroupDevice(vo);
				
				return new ResponseEntity<>(JsonParserHelper.toJson( gvo),responseHeaders,HttpStatus.OK);
				
			}catch(Exception e){
				String error = "[ERROR] Uncaught Exception - Internal server error at getGroupDevice: " + e.getMessage();
				String JsonError = "{ \"error\": \"" + error +"\"";
				logger.error(error);
				return new ResponseEntity<>(JsonError,HttpStatus.INTERNAL_SERVER_ERROR);			
			}
		}
}
