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
public class DoctorDetailsDto {
	private DoctorDto doctordetails;
	private DoctorInfoDto doctorInfo;
	private List<DoctorExpDto> doctorExp;
	private List<DoctorServicesDto> doctorServices;
	private List<DoctorSpecDto> doctorSpec;
	private List<DoctorAmrDto> doctorRewards;
	private List<DoctorAmrDto> doctorMemberShip;
	private List<DoctorAmrDto> doctorRegistration;
	private List<DoctorEducationDto> doctorEducation;

}
