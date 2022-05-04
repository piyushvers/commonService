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
public class DoctorInfoDto {
	private Integer id;
	private BigInteger doctorId;
	private String aboutMe;
	private String clinicName;
	private String clinicAddress;
	private String pricing;
	private Character isActive;
}
