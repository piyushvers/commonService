package com.usp.medicare.dto;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserInfoDTO {

	private String userName;
	
	private String firstName;
	
	private String lastName;
	
	private String dob;
	
	private String sex;
	
	private Map<String, String> bloodGroupMap;
	
	private String bloodGroup;

	private String email;
	
	private String mobile;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String zipCode;
	
	private String country;
}
