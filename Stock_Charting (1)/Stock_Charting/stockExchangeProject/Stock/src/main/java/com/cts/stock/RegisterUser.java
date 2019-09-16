package com.cts.stock;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


import com.cts.stock.entity.User;

@SpringBootApplication
@EnableAutoConfiguration
public class RegisterUser {

	public static void main(String[] args) {
		
		SpringApplication.run(RegisterUser.class, args);
		User user=new User();
		try(
		Scanner scanner=new Scanner(System.in);		
		){
			
			System.out.print("Please Enter User Id:");
			int userId=scanner.nextInt();
			
			System.out.print("Please Enter user Name:");
			String username=scanner.next();
			System.out.print("Please Enter password:");
			String password =scanner.next();
			System.out.print("Please Enter user type (Admin/User):");
			String usertype=scanner.next();
			System.out.print("Please Enter email:");
			String email=scanner.next();
			
			System.out.print("Please Enter mobile:");
			String mobile=scanner.next();
			
			System.out.print("Please Enter confirm(yes/no):");
			String confirm=scanner.next();
			
			user.setConfirm(confirm);
			user.setEmail(email);
			user.setMobile(mobile);
			user.setPassword(password);
			user.setUsertype(usertype);
			user.setUserId(userId);
			user.setUsername(username);
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		RestTemplate template=new RestTemplate();
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> requestEntity=new HttpEntity<String>(headers);
		String url="http://localhost:8087/admins/userpersist";
		template.postForObject(url,user,User.class);
	}

}
