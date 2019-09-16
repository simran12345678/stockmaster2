package com.cts.stock.controller;

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

import com.cts.stock.entity.Admin;
import com.cts.stock.entity.Company;
import com.cts.stock.entity.User;
import com.cts.stock.service.AdminService;
import com.cts.stock.service.CompanyService;
import com.cts.stock.service.UserService; 

	@RestController
	@RequestMapping("/admins")
	public class AdminController {
		@Autowired
		private AdminService adminService;
		
		@Autowired
		UserService userService;
		
		@Autowired
		private CompanyService companyService;
		
		@GetMapping("/allcompany")
		public ResponseEntity<List<Company>> retrieveAllCompany(){
			
			List<Company> companyList=companyService.getAllCompany();
			ResponseEntity<List<Company>> response=new ResponseEntity<List<Company>>(companyList,HttpStatus.OK);
			return response;
		}
		
		@GetMapping("/admin/{username}")
		public ResponseEntity<Admin> retrieveAdminByService(@PathVariable("username") String username){
			System.out.println("inside controller");
			Admin admin=adminService.retrieveAdminByService(username);
			ResponseEntity<Admin> response=null;
			if(admin.getUsername()!=""){
			response=new ResponseEntity<Admin>(admin,HttpStatus.FOUND);
			}else{
			response=new ResponseEntity<Admin>(admin,HttpStatus.NOT_FOUND);

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
		
		
		@PostMapping("userpersist")
		public ResponseEntity<Void> registerUser(@RequestBody User user){
			System.out.println("inside controller");
			
			
			boolean registrationResult1=userService.storeUserData(user);
			
			ResponseEntity<Void> response=null;
			if(registrationResult1){
				response=new ResponseEntity<Void>(HttpStatus.CREATED);
				
			}else{
				response=new ResponseEntity<Void>(HttpStatus.CONFLICT);

			}
			return response;	
		}
		
		
		@GetMapping("/user/{userid}")
		public ResponseEntity<User> retrieveUserById(@PathVariable("userid") int userid){
			System.out.println("inside controller");
			User user=userService.getUserById(userid);
			ResponseEntity<User> response=null;
			if(user.getUserId()!=0){
			response=new ResponseEntity<User>(user,HttpStatus.FOUND);
			}else{
			response=new ResponseEntity<User>(user,HttpStatus.NOT_FOUND);

			}
			return response;
			
		}
		
	
}
