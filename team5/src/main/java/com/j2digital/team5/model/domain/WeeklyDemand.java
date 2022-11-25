package com.j2digital.team5.model.domain;

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
@Document(collection="weekly_demand")
public class WeeklyDemand {
	
	@Id
	private int id;
	private int week;
	private int center_id;
	private int meal_id ;
	private double checkout_price;
	private double base_price;
	private boolean emailer_for_promotion;
	private boolean homepage_featured;
	private int num_orders;
//	id,week,center_id,meal_id,checkout_price,
//	base_price,emailer_for_promotion,
//	homepage_featured,num_orders
}
