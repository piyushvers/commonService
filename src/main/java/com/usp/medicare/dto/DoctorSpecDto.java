package com.usp.medicare.dto;

import java.math.BigInteger;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoctorSpecDto {
	private Integer id;
	private BigInteger doctorId;
	private String specName;
	private Character isActive;
}
