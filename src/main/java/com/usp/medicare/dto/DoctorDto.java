package com.usp.medicare.dto;

import java.math.BigInteger;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
	private BigInteger doctorId;

	private String doctorName;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Character sex;
	private String speciality;
	private String qualification;
	private String dateOfBirth;
	private Integer addressId;
	private String fee;
	private String location;
}
