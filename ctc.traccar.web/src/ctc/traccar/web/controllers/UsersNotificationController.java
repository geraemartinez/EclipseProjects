package ctc.traccar.web.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ctc.traccar.business.interfaces.UsersNotificationServiceInt;

@Controller
@RequestMapping("/UsersNotification")
public class UsersNotificationController {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(UsersNotificationController.class);
	
	@Autowired
	private UsersNotificationServiceInt usersNotificationService;
	
	@RequestMapping(method=RequestMethod.GET,produces={"application/json"})
	@ResponseBody
	public String UserAll() {
		String json = usersNotificationService.getAllAsJson();
	    return json;
	} 
}