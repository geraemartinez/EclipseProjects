package ctc.traccar.web.controllers;




import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ctc.traccar.business.interfaces.UserServiceInt;
import ctc.traccar.models.vo.UserVo;

@Controller
@RequestMapping("/User")
public class UserController {

		@SuppressWarnings("unused")
		private static Logger logger = Logger.getLogger(UserController.class);
		
		@Autowired
		private UserServiceInt userService;
		
		@ModelAttribute("UserVo")
	    public UserVo getUserVo(){
	        return new UserVo();
	    }
		
		@RequestMapping(method=RequestMethod.GET,produces={"application/json"})
		@ResponseBody
		public String UserAll() {
			return userService.getAllAsJson();
			
		} 
}