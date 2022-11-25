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
@Document (collection="center_info")
public class CenterInfo {
	
	@Id
	private int center_id;
	private int city_code;
	private int region_code;
	private String center_type;
	private double op_area;
	
//	center_id,city_code,
//	region_code,center_type,op_area
}
