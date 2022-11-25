package com.j2digital.team5.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j2digital.team5.model.domain.CenterInfo;
import com.j2digital.team5.model.service.MarketService;
import com.j2digital.team5.security.domain.Usuario;
import com.j2digital.team5.security.service.UserService;

@RestController
public class Controller {

	@Autowired
	MarketService marketService;

	@Autowired
	UserService userService;

//	@GetMapping("/byDemand")
//	public List<CenterInfo> orderByDemand() {
//		List<CenterInfo> centers = marketService.getAllCenters();
//
//		Collections.sort(centers, new Comparator<CenterInfo>() {
//			public int compare(CenterInfo c1, CenterInfo c2) {
//				return c1.getPercentage_demand() - c2.getPercentage_demand();
//			}
//		});
//
//		return null;
//	}

	@GetMapping("/getClientes")
	public List<Usuario> getClientes() {
		return userService.getClientes();
	}
	@GetMapping("/getCenters")
	public List<CenterInfo> getCenters(){
		return marketService.getAllCenters();
	}
	
}
