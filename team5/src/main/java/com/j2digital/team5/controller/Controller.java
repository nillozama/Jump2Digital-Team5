package com.j2digital.team5.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j2digital.team5.model.domain.CenterInfo;
import com.j2digital.team5.model.domain.Checkout;
import com.j2digital.team5.model.domain.MealInfo;
import com.j2digital.team5.model.service.MarketService;
import com.j2digital.team5.security.domain.Usuario;
import com.j2digital.team5.security.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {

	@Autowired
	MarketService marketService;

	@Autowired
	UserService userService;
	

	@GetMapping("/getClientes")
	public List<Usuario> getClientes() {
		return userService.getClientes();
	}
	@GetMapping("/getCenters")
	public List<CenterInfo> getCenters(){
		return marketService.getAllCenters();
	}
	@GetMapping("/DemandByType") 
	public List<Object>  getByType(){
		List<CenterInfo> typeA = marketService.getByType("TYPE_A");
		List<CenterInfo> typeB = marketService.getByType("TYPE_B");
		List<CenterInfo> typeC = marketService.getByType("TYPE_C");
		ArrayList<Object>orderByTypes= new ArrayList<>();
		orderByTypes.add(typeA);
		orderByTypes.add(typeB);
		orderByTypes.add(typeC);
		return orderByTypes;
	}
	@GetMapping("/getMeals")
	public List<MealInfo> getMeals(){
		return marketService.getAllProductsInfo();
	}
	
	@GetMapping("/getCheck")
	public List<Checkout> getCheck(){
		return marketService.getCheckouts();
	}
	
	
}
