package com.example.demo;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.http.entity.ContentType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nisum.bo.CategoryBO;

@org.springframework.web.bind.annotation.RestController
public class CustomRestController {

	@GetMapping("/categories")
	@Produces("text/JSON")
	public ResponseEntity<CategoryBO> getCategory() {
		CategoryBO c = new CategoryBO();
		c.setName("Gopal");
		c.setId(16251);
		ResponseEntity<CategoryBO> entity = new ResponseEntity<CategoryBO>(c, HttpStatus.OK);
		return entity;
	}

	@GetMapping("/categoryJSON")
	@Produces("text/JSON")
	public CategoryBO getCategoryJSON() {
		CategoryBO c = new CategoryBO();
		c.setName("Gopal");
		c.setId(16251);
		return c;
	}
	
	@GetMapping("/categoryXML")
	@Produces(MediaType.APPLICATION_XML)
	public @ResponseBody CategoryBO getCategoryXML() {
		CategoryBO c = new CategoryBO();
		c.setName("Gopal");
		c.setId(16251);
		return c;
	}
}
