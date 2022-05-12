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
public class DoctorBookingResponseDto {
  private BigInteger doctorId;
  private SlotScheduleDto slotSchedule;
}
