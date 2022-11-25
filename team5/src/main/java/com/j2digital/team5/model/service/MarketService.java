package com.j2digital.team5.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j2digital.team5.model.domain.CenterInfo;
import com.j2digital.team5.model.domain.Checkout;
import com.j2digital.team5.model.domain.Count;
import com.j2digital.team5.model.domain.MealInfo;
import com.j2digital.team5.model.domain.NumMedioOrdersPorCentro;
import com.j2digital.team5.model.domain.Porcentaje;
import com.j2digital.team5.model.domain.Progresion;
import com.j2digital.team5.model.domain.WeeklyDemand;
import com.j2digital.team5.model.repository.CenterRepository;
import com.j2digital.team5.model.repository.CheckoutRepo;
import com.j2digital.team5.model.repository.CountRepo;
import com.j2digital.team5.model.repository.MealInfoRepo;
import com.j2digital.team5.model.repository.NumRepo;
import com.j2digital.team5.model.repository.PorcentajeRepo;
import com.j2digital.team5.model.repository.ProgRepo;
import com.j2digital.team5.model.repository.WeeklyDemandRepository;

@Service
public class MarketService {
	@Autowired
	CenterRepository centerRepository;

	@Autowired
	WeeklyDemandRepository weeklyDemandRepository;
	@Autowired
	MealInfoRepo mealInfoRepo;
	@Autowired
	CheckoutRepo checkoutRepo;
	@Autowired
	CountRepo countRepo;
	@Autowired
	NumRepo numRepo;
	@Autowired
	PorcentajeRepo porcentajeRepo;
	@Autowired
	ProgRepo progRepo;
	public List<CenterInfo> getAllCenters() {
		return centerRepository.findAll();
	}

	public List<WeeklyDemand> getAllWeeklyDemand() {
		return weeklyDemandRepository.findAll();
	}

	public List<MealInfo> getAllProductsInfo() {
		return mealInfoRepo.findAll();
	}

	

	public List<Checkout> getCheckouts() {
		return checkoutRepo.findAll();
	}

	public List<Count> getCount() {
		return countRepo.findAll();
	}
	public List<NumMedioOrdersPorCentro> orderPerCenter() {
		return numRepo.findAll();
	}

	public List<Porcentaje> getPorcentajes() {
		return porcentajeRepo.findAll();
	}
	public List<Progresion> getProgresions() {
		return progRepo.findAll();
	}
}
