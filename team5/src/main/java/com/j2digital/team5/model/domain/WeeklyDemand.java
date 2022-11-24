package com.j2digital.team5.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="demands")
public class WeeklyDemand {
	
	@Id
	private String id;
	private String center_id;
	private String meal_id;
	private double checkout_price;
	private double base_price;
	private boolean emailer_for_promotion;
	private String homepage_featured;
	private int num_orders;

}
