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
public class DoctorAmrDto {
	private Integer id;
	private BigInteger doctorId;
	private String name;
	private String desc;
	private Character type;
	private String year;
	private Character isActive;
	private Character isCurrent;
}
