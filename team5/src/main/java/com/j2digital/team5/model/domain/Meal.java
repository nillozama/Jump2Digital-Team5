package com.j2digital.team5.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document (collection="meals")
public class Meal {
	
	@Id
	private String meal_id;
	

}
