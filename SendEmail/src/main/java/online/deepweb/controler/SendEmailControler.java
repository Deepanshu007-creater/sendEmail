package online.deepweb.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import online.deepweb.entity.SendEmailEntity;
import online.deepweb.service.SendEmailService;

@RestController
@RequestMapping("/api/v1/email")
@CrossOrigin("*")
public class SendEmailControler {
	
	@Autowired
	private SendEmailService sendEmailService;
	
	
	@PostMapping("/send")
	public ResponseEntity<?> sendEmail(@RequestBody SendEmailEntity sendEmailEntity){
		sendEmailService.sendEmail(sendEmailEntity.getTo(), sendEmailEntity.getSubject(), sendEmailEntity.getMessage());
		return ResponseEntity.ok(
				
				SendEmailResponse.builder().httpStatus(HttpStatus.CREATED).message("mail has been sent!!").success(true).build()
				
				);
	}
	
	
	@GetMapping("/send")
	public ResponseEntity<?> GetEmail(){
		return ResponseEntity.ok(
				
				SendEmailResponse.builder().httpStatus(HttpStatus.CREATED).message("mail has been sent!!").success(true).build()
				
				);
	}
	

}
