package com.usp.medicare.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter 
public class DmsDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigInteger repositoryId;
	private double sizeInBytes;
	private String fileName;
	private String extension;
	private String contentType;
	private String base64;
	private BigInteger userId;
	private BigInteger headerTableId;
	private String headerTableConstant;
	private String menuId;
	private String subMenuId;
	private String isFileDeleted;
	

}
