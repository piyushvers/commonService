package com.usp.medicare.dto;

import java.math.BigInteger;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * OrderDTO class for maintaining the order details
 * @author anuj
 *
 */
@NoArgsConstructor @Getter @Setter 
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private String orderDate;
	private Integer amount;
	private String orderId;
	private String receipt;
	private String keyId;
	private String keySecret;
	private String status;
	private BigInteger orderTxID;
	private String paymentId;
	private BigInteger appointmentId;
	private String signature;
	private String code;
	private String description;
	private String source;
	private String step;
	private String reason;
	private String currency;
	private String name;
	private String emailId;
	private String mobileNumber;
	private String reqDescription;
	private Integer userId;
	private String createBy;
	private String updatedBy;	
	private String paymentDesc;
}
