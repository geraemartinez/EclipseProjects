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
import ctc.traccar.api.vos.PictureVo;
import ctc.traccar.business.helpers.JsonParserHelper;
import ctc.traccar.business.interfaces.DeviceIconServiceInt;


@RestController
@RequestMapping("/api/DeviceIcon")
public class DeviceIconController {

	private static Logger logger = Logger.getLogger(DeviceIconController.class);

	@Autowired 
	DeviceIconServiceInt service;
	
	@ModelAttribute("DeviceIconVo")
    public DeviceIconVo getDeviceIconVo(){
        return new DeviceIconVo();
    }
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getAllDeviceIcon() {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {
			
			List<DeviceIconVo> result =  service.getAllDeviceIcon();
			return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders,HttpStatus.OK);
		
		}catch(Exception e){

			String error="[ERROR] Uncaught Exception - Internal server error at getAllDeviceIcon: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value="/{IdNumber}",method=RequestMethod.GET)
	public ResponseEntity<?> getDeviceIconById(@PathVariable(value="IdNumber") String id) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {
			DeviceIconVo devIcon = new DeviceIconVo(new BigInteger(id));
			DeviceIconVo result =  service.getDeviceIconById(devIcon);
			return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders,HttpStatus.OK);
		
		}catch(Exception e){

			String error="[ERROR] Uncaught Exception - Internal server error at getDeviceIconById: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value="/{IdNumber}/Default",method=RequestMethod.GET)
	public ResponseEntity<?> getDefaultIconByDeviceIcon(@PathVariable(value="IdNumber") String id) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {
			DeviceIconVo devIcon = new DeviceIconVo(new BigInteger(id));
			PictureVo result =  service.getDefaultIconByDeviceIcon(devIcon);
			return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders,HttpStatus.OK);
		
		}catch(Exception e){

			String error="[ERROR] Uncaught Exception - Internal server error at getDefaultIconByDeviceIcon: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value="/{IdNumber}/Offline",method=RequestMethod.GET)
	public ResponseEntity<?> getofflineIconByDeviceIcon(@PathVariable(value="IdNumber") String id) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {
			
			DeviceIconVo devIcon = new DeviceIconVo(new BigInteger(id));
			PictureVo result =  service.getofflineIconByDeviceIcon(devIcon);
			return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders,HttpStatus.OK);
		
		}catch(Exception e){

			String error="[ERROR] Uncaught Exception - Internal server error at getofflineIconByDeviceIcon: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value="/{IdNumber}/Selected",method=RequestMethod.GET)
	public ResponseEntity<?> getselectedIconByDeviceIcon(@PathVariable(value="IdNumber") String id) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		
		try {
			DeviceIconVo devIcon = new DeviceIconVo(new BigInteger(id));
			PictureVo result =  service.getselectedIconByDeviceIcon(devIcon);
			return new ResponseEntity<>(JsonParserHelper.toJson(result),responseHeaders,HttpStatus.OK);
		
		}catch(Exception e){

			String error="[ERROR] Uncaught Exception - Internal server error at getselectedIconByDeviceIcon: " + e.getMessage();
			String JsonError = "{ \"error\": \"" + error +"\"";
			logger.error(error);
			return new ResponseEntity<>(JsonError,responseHeaders,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}
