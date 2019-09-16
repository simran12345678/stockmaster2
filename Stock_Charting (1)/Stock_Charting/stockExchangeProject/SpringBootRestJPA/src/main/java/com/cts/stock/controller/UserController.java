package com.cts.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.stock.entity.User;
import com.cts.stock.service.UserService;
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("userpersist")
	public ResponseEntity<Void> registerUser(@RequestBody User user){
		
		
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
