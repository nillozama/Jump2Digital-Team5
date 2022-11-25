package com.j2digital.team5.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j2digital.team5.model.domain.CenterInfo;
import com.j2digital.team5.model.domain.Product;
import com.j2digital.team5.model.domain.ShoppingCart;
import com.j2digital.team5.model.domain.WeeklyDemand;
import com.j2digital.team5.model.repository.CenterRepository;
import com.j2digital.team5.model.repository.ShoppingCartRepository;
import com.j2digital.team5.model.repository.ProductRepository;
import com.j2digital.team5.model.repository.WeeklyDemandRepository;
import com.j2digital.team5.security.repository.UserRepository;

@Service
public class MarketService {
	@Autowired
	CenterRepository centerRepository;
	@Autowired
	ShoppingCartRepository shoppingCartRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	WeeklyDemandRepository weeklyDemandRepository;
	
	public List<ShoppingCart> getAllOrders(){
		return shoppingCartRepository.findAll();
	}
	
	public List<CenterInfo> getAllCenters(){
		return centerRepository.findAll();		
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();		
	}

	public List<WeeklyDemand> getAllWeeklyDemand(){
		return weeklyDemandRepository.findAll();
	}
	
	
}
