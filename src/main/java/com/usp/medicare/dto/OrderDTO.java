package com.usp.medicare.dto;

import java.util.Date;

import org.springframework.lang.NonNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * OrderDTO class for maintaining the order details
 * @author anuj
 *
 */
@NoArgsConstructor @Getter @Setter 
public class OrderDTO {
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
}
