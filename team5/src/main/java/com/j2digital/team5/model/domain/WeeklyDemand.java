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
@Document(collection="weeklyDemand")
public class WeeklyDemand {
	
	private String id;
	private String week;
	private String centerId;
	private String mealId ;
	private String checkoutPrice;
	private String basePrice;
	private String emailerForPromotion;
	private String homepageFeatured;
	private String numOrders;
	/*
	id,week,centerId,mealId,checkoutPrice,
	basePrice,emailerForPromotion,homepageFeatured,numOrders
	*/
}
