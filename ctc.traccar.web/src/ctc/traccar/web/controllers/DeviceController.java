package ctc.traccar.web.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ctc.traccar.business.interfaces.DeviceServiceInt;
import ctc.traccar.models.vo.DeviceVo;

@Controller
@RequestMapping("/Device")
public class DeviceController {

		@SuppressWarnings("unused")
		private static Logger logger = Logger.getLogger(DeviceController.class);
		
		@Autowired
		private DeviceServiceInt deviceService;
		
		@ModelAttribute("UserVo")
	    public DeviceVo getDeviceVo(){
	        return new DeviceVo();
	    }
		
		@RequestMapping(method=RequestMethod.GET,produces={"application/json"})
		@ResponseBody
		public String DeviceAll() {
			return deviceService.getAllAsJson();
			
		} 
}