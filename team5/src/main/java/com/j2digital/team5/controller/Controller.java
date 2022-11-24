package com.j2digital.team5.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j2digital.team5.model.domain.Center;
import com.j2digital.team5.model.service.MarketService;
import com.j2digital.team5.security.domain.Usuario;
import com.j2digital.team5.security.service.UserService;

@RestController
public class Controller {

	@Autowired
	MarketService marketService;

	@Autowired
	UserService userService;

	@GetMapping("/byDemand")
	public List<Center> orderByDemand() {
		List<Center> centers = marketService.getAllCenters();

		Collections.sort(centers, new Comparator<Center>() {
			public int compare(Center c1, Center c2) {
				return c1.getPercentage_demand() - c2.getPercentage_demand();
			}
		});

		return null;
	}

	@GetMapping("/getClientes")
	public List<Usuario> getClientes() {
		return userService.getClientes();
	}
}
