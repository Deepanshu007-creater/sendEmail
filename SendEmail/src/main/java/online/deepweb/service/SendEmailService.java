package online.deepweb.service;

import java.io.File;
import java.io.IOException;

import org.springframework.scheduling.support.SimpleTriggerContext;

import jakarta.mail.MessagingException;

public interface SendEmailService {
	
	void sendEmail(String to,String subject, String message);
	
	void sendEmail(String[] to,String subject, String message);
	
	void sendEmailWithHTML(String to,String subject,String message) throws MessagingException;
	
	void sendEmailWithHTML(String[] to,String subject,String message) throws MessagingException;
	
	void sendEmailWithFile(String to,String subject,String message, File file) throws IOException;
	
	void sendEmailWithFile(String[] to,String subject,String message, File file) throws IOException;
	
	void sendEmailWithFileandHTML(String to,String subject,String message, File file) throws IOException;
	
	void sendEmailWithFileandHTML(String[] to,String subject,String message, File file) throws IOException;

}
