package com.j2digital.team5.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j2digital.team5.model.domain.CenterInfo;
import com.j2digital.team5.model.domain.Checkout;
import com.j2digital.team5.model.domain.Product;
import com.j2digital.team5.model.domain.MealInfo;
import com.j2digital.team5.model.domain.WeeklyDemand;
import com.j2digital.team5.model.repository.CenterRepository;
import com.j2digital.team5.model.repository.CheckoutRepo;
import com.j2digital.team5.model.repository.MealInfoRepo;
import com.j2digital.team5.model.repository.ProductRepository;
import com.j2digital.team5.model.repository.WeeklyDemandRepository;

@Service
public class MarketService {
	@Autowired
	CenterRepository centerRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	WeeklyDemandRepository weeklyDemandRepository;
	@Autowired
	MealInfoRepo mealInfoRepo;
	@Autowired
	CheckoutRepo checkoutRepo;
	
	
	public List<CenterInfo> getAllCenters(){
		return centerRepository.findAll();		
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();		
	}

	public List<WeeklyDemand> getAllWeeklyDemand(){
		return weeklyDemandRepository.findAll();
	}
	public List<MealInfo> getAllProductsInfo(){
		return mealInfoRepo.findAll();		
	}
	public List<CenterInfo> getByType(String type){
		return centerRepository.findByCenterType(type);
	}
	public List<Checkout> getCheckouts(){
		return checkoutRepo.findAll();
	}
	
}
