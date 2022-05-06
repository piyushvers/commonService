package com.usp.medicare.dto;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorEducationDto {
	
	private Integer id;
	private BigInteger doctorId;
	private String degreeName;
	private String collegeName;
	private String year;

}
