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
	private String order_id;
	private String cliente_id;
	private String center_id;
	private List<Product> productos;
	private double precio_total;
	

}
