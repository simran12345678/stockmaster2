package com.cts.stock;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;
import com.cts.stock.entity.Admin;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.cts.*")
public class RetriveByName {
	
			// TODO Auto-generated method stub
			public static void main(String[] args) 
			{
			
			SpringApplication.run(RetriveByName.class, args);
			RestTemplate template=new RestTemplate();
			HttpHeaders headers=new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			
			HttpEntity<String> requestEntity=new HttpEntity<String>(headers);
			String url="http://localhost:8087/admins/admin/{username}";
			
			Scanner scanner=new Scanner(System.in);
			System.out.print("Please Enter Admin Username:");
			String username=scanner.nextLine();
			
			ResponseEntity<Admin> response=
					template.exchange(url,HttpMethod.GET,requestEntity,Admin.class,username);
			
			
			Admin admin=response.getBody();
	 
	        	System.out.println(admin);
	     
				
	        

		

	}
	
}
