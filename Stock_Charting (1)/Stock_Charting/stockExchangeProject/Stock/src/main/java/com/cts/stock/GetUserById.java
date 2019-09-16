package com.cts.stock;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cts.stock.entity.Admin;
import com.cts.stock.entity.Company;
import com.cts.stock.entity.User;

@SpringBootApplication
@EnableAutoConfiguration
public class GetUserById {

public static void main(String[] args)
{
	
		
		SpringApplication.run(GetUserById.class, args);
		RestTemplate template=new RestTemplate();
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> requestEntity=new HttpEntity<String>(headers);
		String url="http://localhost:8087/admins/user/{userid}";
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please Enter userId:");
		int userid=scanner.nextInt();
		
		ResponseEntity<User> response=
				template.exchange(url,HttpMethod.GET,requestEntity,User.class,userid);
		
		
		User user = response.getBody();
 
        	System.out.println(user);
     
	
}
}
