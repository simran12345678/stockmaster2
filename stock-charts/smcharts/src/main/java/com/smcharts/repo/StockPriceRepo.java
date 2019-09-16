package com.smcharts.repo;

import org.springframework.data.repository.CrudRepository;

import com.smcharts.model.StockPrice;

public interface StockPriceRepo extends CrudRepository<StockPrice, Long>{

}
