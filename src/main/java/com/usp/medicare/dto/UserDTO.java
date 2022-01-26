package com.usp.medicare.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
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
	
	
	private BigInteger userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String dob;
	private String bloodGroup;
	private String email;
	private String mobile;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	
	private String oneTimePassword;
	
	private Date otpRequestedTime;
	private String password;
	
	private Boolean isOTPRequired;
	
}
