package com.usp.medicare.dto;

import java.util.List;

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
public class SlotScheduleDto {
  private List<SlotDto> mon;
  private List<SlotDto> tue;
  private List<SlotDto> wed;
  private List<SlotDto> thu;
  private List<SlotDto> fri;
  private List<SlotDto> sat;
  private List<SlotDto> sun;
}
