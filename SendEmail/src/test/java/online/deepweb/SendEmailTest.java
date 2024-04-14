package online.deepweb;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.mail.MessagingException;
import online.deepweb.service.SendEmailService;

@SpringBootTest
public class SendEmailTest {
	
	@Autowired
	private SendEmailService sendEmailService;
	
//	public String[] strings= {"deepchauhan9758@gmail.com","deepgujjar.bm@gmail.com"};
	
//	@Test
//	public void sendEmail() {
//		System.out.println("sending email....");
//		sendEmailService.sendEmail("deepanshuchauhan866.iimt@gmail.com", "API Test for sending mail", "With the help of this, we can be send mail from servicenow by integration.");
//	}
//	
//	@Test
//	public void sendEmailWithHtml() throws MessagingException {
//		sendEmailService.sendEmailWithHTML("deepanshuchauhan866.iimt@gmail.com","send by html api", "<h1 style='color:red'>API Testing</h1>");
//	}
//	
//	@Test
//	public void sendEmail() {
//		System.out.println("sending email....");
//		sendEmailService.sendEmail(strings, "API Test for sending mail", "With the help of this, we can be send mail from servicenow by integration.");
//	}
	
	@Test
	public void sendEmailWithFile() throws IOException {
		System.out.println("email sending....");
		sendEmailService.sendEmailWithFile(
				
				"deepanshuchauhan866.iimt@gmail.com", 
				"API Testing", 
				"File send by api testing", 
				new File("C:\\Users\\vansika\\Documents\\workspace-spring-tool-suite-4-4.20.0.RELEASE\\SendEmail\\src\\main\\resources\\static\\Image\\20191105_144307.jpg"));
		
	}

}
