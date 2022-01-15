package com.usp.medicare.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Account class for maintaining the user details
 * @author piyus
 *
 */
@NoArgsConstructor @Getter @Setter 
public class UserDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final long OTP_VALID_DURATION = 5 * 60 * 1000; // 5 minutes
	
	@NonNull
	private String oneTimePassword;
	
	@NonNull
	private Date otpRequestedTime;
	private String email;
	private String userName;
	private String password;
	
	@NonNull
	private String mobNumber;
	private String userId;
	
	
	
	public boolean isOTPRequired() {
		return true;
	}
}
