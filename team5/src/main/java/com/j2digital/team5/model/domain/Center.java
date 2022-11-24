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
@Document (collection="center")
public class Center {
	
	@Id
	private String center_id;
	private String cityCode;
	private String region_code;
	private String centerType;
	private String op_area;
	private int percentage_demand;
	
	
}
