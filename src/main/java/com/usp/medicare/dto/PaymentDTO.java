package com.usp.medicare.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PaymentDTO {

	private String name;
	private String email;
	private String mobNum;
	private Integer amount;

}
