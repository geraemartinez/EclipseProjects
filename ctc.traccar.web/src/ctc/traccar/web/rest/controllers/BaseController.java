package ctc.traccar.web.rest.controllers;

import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BaseController {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(BaseController.class);

	
	@RequestMapping("/unAuthorized")
    public ResponseEntity<?> deny(){
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=utf-8");
		return new ResponseEntity<>(responseHeaders,HttpStatus.UNAUTHORIZED);
    }

	
}
