package com.usp.medicare.dto;

import java.io.Serializable;

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

	private String clinicType;
	
	private String doctorName;
	
	private String patientName;
	
	private String patientEmail;
	
	private String patientPhone;
	
	//@DateTimeFormat(iso=ISO.DATE)
	private String appointmentDate;
	
	private String appointmentTime;
	
	private String appointmentStatus;
	
	private String pricePaid;
	
	private String docImage;
	
	private String docId;
}
