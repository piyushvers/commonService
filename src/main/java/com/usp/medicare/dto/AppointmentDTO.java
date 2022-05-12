package com.usp.medicare.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Api for getting appointment request
 * @author piyus
 *
 */
@NoArgsConstructor @Getter @Setter 
public class AppointmentDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigInteger appointmentId;
	
	private Integer slotId;
	
	private BigInteger clinicId;
	
	private BigInteger doctorId;
	
	private BigInteger userId;
	
	private BigInteger pricePaid;
	
	private String patientName;
	
	private String patientEmail;
	
	private String patientPhone;
	
	private String appointmentDate;
	
	private String appointmentTime;

	private String appointmentStatus;
	

	private String clinicType;
	
	private String doctorName;
	
	
	
	private String errorCode;
	
	private String message;
	
	private String languageCode;
	
	private Boolean isErrorInd;
	
	
}
