package com.smcharts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.smcharts.service.StockExchangeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StockExchangeController {

	@Autowired
	StockExchangeService stockExchangeService;
}
