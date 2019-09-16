package com.smcharts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.smcharts.service.IPOService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class IPOController {

	@Autowired
	IPOService ipoService;
}
