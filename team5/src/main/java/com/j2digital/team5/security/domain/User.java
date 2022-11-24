package com.j2digital.team5.security.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.j2digital.team5.security.dto.Rol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document (collection="users")
public class User {
	
	@Id
	private String id;
	private String username;
	private String password;
	private List<Rol> roles;
	

}
