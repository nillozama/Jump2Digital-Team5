package com.j2digital.team5.model.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="orders")
public class ShoppingCart {
	
	@Id
	private String orderId;
	private String clienteId;
	private String centerId;
	private List<Product> productos;
	private double precioTotal;
	

}
