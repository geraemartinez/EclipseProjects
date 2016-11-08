package ctc.traccar.web.controllers;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import ctc.traccar.business.service.NotificationServiceInt;
import ctc.traccar.business.service.UserServiceInt;
import ctc.traccar.models.vo.NotificationVo;
import ctc.traccar.models.vo.UserVo;

@Controller
public class HomeController {
	
	//This enable log4j to get logs for this controller
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(HomeController.class);
	
	@Autowired
	private UserServiceInt userService;
	@Autowired
	private NotificationServiceInt notificationService;
	
	@ModelAttribute("UserVo")
    public UserVo getUserVo(){
        return new UserVo();
    }
	
	@ModelAttribute("NotificationVo")
    public NotificationVo getNotificationVoVo(){
        return new NotificationVo();
    }
	
	@RequestMapping(path="/login",method = RequestMethod.POST)
	@ResponseBody
	public String login(@RequestBody String json){
		Gson gson = new Gson();
		UserVo vo = new UserVo();
		vo = gson.fromJson(json,UserVo.class);
		UserVo result=userService.login(vo);
        return new Gson().toJson(result);
    }
	
	@RequestMapping("/index")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }
	
	@RequestMapping("/Notification/GetAll")
	@ResponseBody
	public String NotificationAll() {
		List<NotificationVo> result =  notificationService.getAll();
		return new Gson().toJson(result);
	} 
	
	@RequestMapping("/Notification/GetById")
	@ResponseBody
	public String NotificationById() {
		NotificationVo vo = new NotificationVo();
		vo.setId(1);
		NotificationVo result =  notificationService.getById(vo);
		return new Gson().toJson(result);
	} 
	
	@RequestMapping("/User/GetAll")
	@ResponseBody
	public String UserAll() {
		List<UserVo> result =  userService.getAll();
		return new Gson().toJson(result);
	} 
	
	@RequestMapping("/User/GetById")
	@ResponseBody
	public String UserById() {
		UserVo vo = new UserVo();
		vo.setId(1);
		UserVo result =  userService.getById(vo);
		return new Gson().toJson(result);
	} 
}
