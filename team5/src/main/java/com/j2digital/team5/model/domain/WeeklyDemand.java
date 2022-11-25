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
@Document(collection="demands")
public class WeeklyDemand {
	
	@Id
	private String id;
	private String centerId;
	private String mealId;
	private double checkoutPrice;
	private double basePrice;
	private boolean emailerForPromotion;
	private String homepageFeatured;
	private int numOrders;

}
