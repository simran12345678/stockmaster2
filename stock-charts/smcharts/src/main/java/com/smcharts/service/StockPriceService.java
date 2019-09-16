package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import com.smcharts.model.StockPrice;

public interface StockPriceService {

	public List<StockPrice> getStockPrices();
	
	public StockPrice createUser(StockPrice stockPrice);

	public Optional<StockPrice> getStockPriceById(Long id);
}
