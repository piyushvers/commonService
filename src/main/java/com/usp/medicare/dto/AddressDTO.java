package com.usp.medicare.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Physical Address for the User
 * 
 * @author piyus
 *
 */
@NoArgsConstructor @Getter @Setter 
public class AddressDTO implements Serializable{

	private String userID;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String addressType;	
	
}
