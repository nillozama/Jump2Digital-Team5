package com.j2digital.team5.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document (collection="centers")
public class Center {
	
	@Id
	private String center_id;
	private String city_code;
	private String region_code;
	private String center_type;
	private String op_area;

}
