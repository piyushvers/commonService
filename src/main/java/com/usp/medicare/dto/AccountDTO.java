package com.usp.medicare.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter 
public class AccountDTO implements Serializable{

	private String firstName;
	private String lastName;
	private String fullName;
	//private String mobNumber;
	//private String emailID;
	private String sex;
	private String dob;
	private String bloodGroup;
	private String userID;
}
