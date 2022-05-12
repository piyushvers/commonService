package com.usp.medicare.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyDto {

	private Integer propertyId;
	private String propertyName;
	private String propertyValue;
	private String propertyCd;
	private Character isActive;

}
