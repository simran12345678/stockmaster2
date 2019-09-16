package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smcharts.model.StockPrice;
import com.smcharts.repo.StockPriceRepo;

@Service
public class StockPriceServiceImpl implements StockPriceService{

	@Autowired
	StockPriceRepo stockPriceRepo;
	
	public List<StockPrice> getStockPrices(){
		return (List<StockPrice>) stockPriceRepo.findAll();
	}

	@Override
	public StockPrice createUser(StockPrice stockPrice) {
		return stockPriceRepo.save(stockPrice);
	}

	@Override
	public Optional<StockPrice> getStockPriceById(Long id) {
		return stockPriceRepo.findById(id);
	}
	
}
