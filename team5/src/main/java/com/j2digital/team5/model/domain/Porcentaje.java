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
@Document (collection="porcentaje")
public class Porcentaje {
	private String center_type;
	private String porcentaje_descuento;
}
