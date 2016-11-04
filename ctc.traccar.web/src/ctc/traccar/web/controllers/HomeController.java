package ctc.traccar.web.controllers;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//This enable log4j to get logs for this controller
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(HomeController.class);
	
	@RequestMapping("/index")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }
}
