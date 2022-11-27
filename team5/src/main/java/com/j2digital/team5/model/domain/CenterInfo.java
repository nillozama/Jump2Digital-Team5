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
@Document (collection="CenterInfo")
public class CenterInfo {
	
	@Id
	private String centerId;
	private String cityCode;
	private String regionCode;
	private String centerType;
	private String opArea;
	
//	center_id,city_code,
//	region_code,center_type,op_area
}
