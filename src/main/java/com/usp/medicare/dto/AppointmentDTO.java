package com.usp.medicare.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
	
	private String clinicType;
	
	private String doctorName;
	
	private String patientName;
	
	private String patientEmail;
	
	private String patientPhone;
	
	//@DateTimeFormat(iso=ISO.DATE)
	private LocalDate appointmentDate;
	
	private LocalDateTime appointmentTime;
	
	private String appointmentStatus;
	
	private String pricePaid;
	
	private String docImage;
	
	private String docId;
}
