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
public class DoctorExpDto {
	private Integer id;
	private BigInteger doctorId;
	private String hospitalName;
	private String workedFrom;
	private String workedTo;
	private String designation;
}
