package com.j2digital.team5.model.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document (collection="checkout")
public class Checkout {
	
	private String id;
	private String centerType;
	private String category;
	private String num_orders;
	private String checkoutPrice;

}
