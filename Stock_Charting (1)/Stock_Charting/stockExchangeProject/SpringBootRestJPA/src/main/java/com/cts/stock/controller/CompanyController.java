package com.cts.stock.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.stock.entity.Company;
import com.cts.stock.service.CompanyService;
public class CompanyController {


@RestController
@RequestMapping("/companys")
public class InternsController {
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/allcompany")
	public ResponseEntity<List<Company>> retrieveAllCompany(){
		
		List<Company> companyList=companyService.getAllCompany();
		ResponseEntity<List<Company>> response=new ResponseEntity<List<Company>>(companyList,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/company/{cid}")
	public ResponseEntity<Company> retrieveInternById(@PathVariable("cid") int cid){
		Company company=companyService.getCompanyById(cid);
		ResponseEntity<Company> response=null;
		if(company.getCid()!=0){
		response=new ResponseEntity<Company>(company,HttpStatus.FOUND);
		}else{
		response=new ResponseEntity<Company>(company,HttpStatus.NOT_FOUND);

		}
		return response;
		
	}
	
	
	@PostMapping("companypersist")
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
	
	
	@PutMapping("updateCompany")
	public ResponseEntity<Void> updateCompany(@RequestBody Company company)
	{
		boolean updateCompany=companyService.updateComapany(company);
		ResponseEntity<Void> response=null;
		if(updateCompany==true)
			response=new ResponseEntity<Void>(HttpStatus.ACCEPTED);	
		else
			response=new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		return response;
	}
	
}
}
