package com.example.controller;
import org.springframework.web.bind.annotation.*;
import com.example.utility.ResponseMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/message")
public class CustomerController {

	

	@Value("${server.port}") 
	private int port;



	@GetMapping("/getMessage/{message}")
	public ResponseEntity<?> getMessage (@PathVariable("message") String megssage) {
		
		ResponseMessage resMessage = new ResponseMessage();
		String replyMessage="World";

		resMessage.setStatus("ok");
		resMessage.setType("save");
		resMessage.setMessage(megssage+" "+replyMessage);
		
		return ResponseEntity.ok(resMessage);
	}

	

	
}
