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
@Document (collection="countCorder")
public class Count {
	
	private String centerId;
	private String cityCode;
	private String regionCode;
	private String centerType;
	private String opArea;

}
