package com.j2digital.team5.model.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document (collection="progresion")
public class Progresion {
	private String porcentaje_dif_interanual_type_A_x;
	private String porcentaje_dif_interanual_type_A_y;
	private String porcentaje_dif_interanual_type_A;
	
}
