package online.deepweb.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import online.deepweb.service.SendEmailService;

@Service
public class SendEmailServiceImpl implements SendEmailService{
	
	private JavaMailSender javaMailSender;
	
	private Logger logger=LoggerFactory.getLogger(SendEmailServiceImpl.class);

	public SendEmailServiceImpl(JavaMailSender javaMailSender) {
		super();
		this.javaMailSender = javaMailSender;
	}

	@Override
	public void sendEmail(String to, String subject, String message) {
		
		// TODO Auto-generated method stub
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message);
		simpleMailMessage.setFrom("deepchauhan9758@gmail.com");
		javaMailSender.send(simpleMailMessage);
		
		logger.info("Email has been sent!!!");
	
	}

	@Override
	public void sendEmail(String[] to, String subject, String message) {
		// TODO Auto-generated method stub
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message);
		simpleMailMessage.setFrom("deepchauhan9758@gmail.com");
		javaMailSender.send(simpleMailMessage);
		logger.info("mail has been sent!!!");
		
	}

	@Override
	public void sendEmailWithHTML(String to, String subject, String message) throws MessagingException {
		// TODO Auto-generated method stub
		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		MimeMessageHelper helper= new MimeMessageHelper(mimeMessage,true,"UTF-8");
		
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(message, true);
		helper.setFrom("deepchauhan9758@gmail.com");
		javaMailSender.send(mimeMessage);
		logger.info("mail has been sent!!!");
	}

	@Override
	public void sendEmailWithFile(String to, String subject, String message, File file)throws IOException {
		// TODO Auto-generated method stub
		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		
		try {
			MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(message);
			helper.setFrom("deepchauhan9758@gmail.com");
			FileSystemResource fileSystemResource=new FileSystemResource(file);
			
			helper.addAttachment(fileSystemResource.getFilename(),file);
			javaMailSender.send(mimeMessage);
			logger.info("mail has been sent");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void sendEmailWithHTML(String[] to, String subject, String message) throws MessagingException {
		// TODO Auto-generated method stub
		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		MimeMessageHelper helper= new MimeMessageHelper(mimeMessage,true,"UTF-8");
		
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(message, true);
		helper.setFrom("deepchauhan9758@gmail.com");
		javaMailSender.send(mimeMessage);
		logger.info("mail has been sent!!!");
		
	}

	@Override
	public void sendEmailWithFile(String[] to, String subject, String message, File file) throws IOException {
		// TODO Auto-generated method stub
MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		
		try {
			MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(message);
			helper.setFrom("deepchauhan9758@gmail.com");
			FileSystemResource fileSystemResource=new FileSystemResource(file);
			
			helper.addAttachment(fileSystemResource.getFilename(),file);
			javaMailSender.send(mimeMessage);
			logger.info("mail has been sent");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void sendEmailWithFileandHTML(String to, String subject, String message, File file) throws IOException {
		// TODO Auto-generated method stub
MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		
		try {
			MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true,"UTF-8");
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(message,true);
			helper.setFrom("deepchauhan9758@gmail.com");
			FileSystemResource fileSystemResource=new FileSystemResource(file);
			
			helper.addAttachment(fileSystemResource.getFilename(),file);
			javaMailSender.send(mimeMessage);
			logger.info("mail has been sent");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void sendEmailWithFileandHTML(String[] to, String subject, String message, File file) throws IOException {
		// TODO Auto-generated method stub
MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		
		try {
			MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true,"UTF-8");
			helper.setTo(to);
			helper.setSubject(subject);
//			helper.setText(message);
			helper.setText(message, true);
			helper.setFrom("deepchauhan9758@gmail.com");
			FileSystemResource fileSystemResource=new FileSystemResource(file);
			
			helper.addAttachment(fileSystemResource.getFilename(),file);
			javaMailSender.send(mimeMessage);
			logger.info("mail has been sent");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
