package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.SuccessfullMsgDTO;
import com.google.gson.Gson;




@Controller
@RequestMapping("/test")
public class TestController {

	private Gson gson;
	@Autowired
	public TestController(Gson gson) {
		this.gson = gson;
		
	}
	
	
	@GetMapping("/index")
	public ResponseEntity<?> test() {
		
		SuccessfullMsgDTO successfullMsgDTO = new SuccessfullMsgDTO("Successfull Register User");
			return new ResponseEntity<>(gson.toJson(successfullMsgDTO),HttpStatus.CREATED);
		
	}
	
}
