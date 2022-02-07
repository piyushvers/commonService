package com.usp.medicare.dto;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {

	private String name;
	private String email;
	private String mobNum;
	private Integer amount;
	private BigInteger appointmentId;
}
