package com.example.demo;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nisum.bo.CategoryBO;



@Controller
public class WelcomeController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/helloWS", method = RequestMethod.GET)
	public @ResponseBody CategoryBO getCategoriesJSON() {
		CategoryBO categoryBO = new CategoryBO();
		categoryBO.setId(16252);
		categoryBO.setName("Kiran");
		return categoryBO;
	}

	@RequestMapping(value = "/printWS", method = RequestMethod.GET)
	public ResponseEntity<String> getResponse() {

		ResponseEntity<String> rs = new ResponseEntity<String>("Successfully submitted", HttpStatus.FORBIDDEN);

		return rs;
	}
	@RequestMapping(value="/helloXML/{child}",produces=MediaType.APPLICATION_XML,
			consumes="text/plain")
	public @ResponseBody String getXMLReponse(@PathParam("child") String child,HttpServletResponse response) {
		response.setContentType(MediaType.APPLICATION_XML);
		return "xml tag with"+child;
		
	}

}