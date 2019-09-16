package com.cts.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Company;
import com.cts.service.CompanyService;

public class CompanyController {


@RestController
@RequestMapping("/companys")
public class InternsController {
	@Autowired
	private CompanyService companyService;
	

	@GetMapping("companypersist")
	public ResponseEntity<Void> registerCompany(@RequestBody Company company){
		
		boolean registrationResult=companyService.storeCompanyData(company);
		
		ResponseEntity<Void> response=null;
		if(registrationResult){
			response=new ResponseEntity<Void>(HttpStatus.CREATED);
			
		}else{
			response=new ResponseEntity<Void>(HttpStatus.CONFLICT);

		}
		return response;	
	}
	
	
	
	
}
}
