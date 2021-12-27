package com.usp.medicare.util;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.usp.medicare.constants.ApplicationConstants;
import com.usp.medicare.dto.UserDTO;

public class MailUtil {

	@Autowired
	private JavaMailSender mailSender;
	

	/**
	 * Method to send OTP to the customer through email
	 * 
	 * @param user
	 * @param OTP
	 * @throws UnsupportedEncodingException
	 * @throws MessagingException
	 */
	public void sendOTPEmail(UserDTO user, String otp) throws UnsupportedEncodingException, MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom(ApplicationConstants.MAIL_FROM, ApplicationConstants.MAIL_FROM_PERSON);
		helper.setTo(user.getEmail());

		String subject = ApplicationConstants.MAIL_SUBJECT;

		String content = "<p>Hello " + user.getEmail() + "</p>"
				+ "<p>For security reason, you're required to use the following " + "One Time Password to login:</p>"
				+ "<p><b>" + otp + "</b></p>" + "<br>" + "<p>Note: this OTP is set to expire in 5 minutes.</p>";

		helper.setSubject(subject);

		helper.setText(content, true);
		try {
		mailSender.send(message);
		}catch(Exception e) {
			System.out.println("Exception"+e);
		}
	}
}
