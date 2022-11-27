package com.j2digital.team5.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j2digital.team5.model.domain.CenterInfo;
import com.j2digital.team5.model.domain.Checkout;
import com.j2digital.team5.model.domain.Count;
import com.j2digital.team5.model.domain.MealInfo;
import com.j2digital.team5.model.domain.NumMedioOrdersPorCentro;
import com.j2digital.team5.model.domain.Porcentaje;
import com.j2digital.team5.model.domain.Progresion;
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
	
	@GetMapping("/getMeals")
	public List<MealInfo> getMeals(){
		return marketService.getAllProductsInfo();
	}
	
	@GetMapping("/getCheck")
	public List<Checkout> getCheck(){
		return marketService.getCheckouts();
	}
	
	@GetMapping("/countCorder")
	public List<Count> getCount(){
		return marketService.getCount();
	}
	
	@GetMapping("/numPerCenter")
	public List<NumMedioOrdersPorCentro> perCenter(){
		return marketService.orderPerCenter();
	}
	
	@GetMapping("/porcentaje")
	public List<Porcentaje> getPorcentajes(){
		return marketService.getPorcentajes();
	}
	@GetMapping("/progresion")
	public List<Progresion> getProg(){
		return marketService.getProgresions();
	}
	
	
	
}
