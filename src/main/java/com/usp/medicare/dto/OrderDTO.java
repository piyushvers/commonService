package com.usp.medicare.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * OrderDTO class for maintaining the order details
 * @author anuj
 *
 */
@NoArgsConstructor @Getter @Setter 
public class OrderDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date orderDate;
	private Integer amount;
	private String orderId;
	private String receipt;
	private String keyId;
	private String keySecret;
	private String status;
	private BigInteger orderTxID;
}
