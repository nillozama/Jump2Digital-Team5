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
@Document (collection="meals")
public class Product {
	
	@Id
	private String id;
	private String name;
	private String price;
	private List <ProductInfo> productInfo;

}
