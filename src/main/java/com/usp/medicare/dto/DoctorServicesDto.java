package com.usp.medicare.dto;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorServicesDto {
	private Integer id;
	private BigInteger doctorId;
	private String serviceName;
	private Character isActive;
}
