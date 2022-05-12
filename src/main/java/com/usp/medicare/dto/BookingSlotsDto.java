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
public class BookingSlotsDto {
	private Integer slotId;
	private BigInteger doctorId;
	private Integer dayId;
	private String startTime;
	private String endTime;
	private String duration;
	private Character isActive;
}
