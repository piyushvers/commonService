package com.usp.medicare.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * SMSDto class for maintaining the SMS OTP details
 * @author anuj
 *
 */
@NoArgsConstructor @Getter @Setter 
public class SMSDto {
	
	private String mobile;
	private String source;
	private String otp;
	private String errorCode;
	private String message;
	private String languageCode;
	private Boolean isErrorInd;
	
	// Field to check if OTP is validated
	private Boolean isOtpValidated;
	private String userId;

}
