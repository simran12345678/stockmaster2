package com.cts.stock;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.cts.stock.entity.Company;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "com.cts.*")
public class AddCompany {

	public static void main(String[] args) {
	
	SpringApplication.run(AddCompany.class, args);
	Company company=new Company();
	try(
	Scanner scanner=new Scanner(System.in);		
	){
		
		System.out.print("Please Enter Company Id:");
		int cid=scanner.nextInt();
		
		System.out.print("Please Enter Company Name:");
		String cname=scanner.next();
		System.out.print("Please Enter Turnover:");
		int turnover=scanner.nextInt();
		System.out.print("Please Enter CEO");
		String ceo=scanner.next();
		System.out.print("Please Enter BOD:");
		String bod=scanner.next();
		
		System.out.print("Please Enter Exchanges:");
		String exchange=scanner.next();
		
		System.out.print("Please Enter Sector:");
		String sector=scanner.next();
		
		System.out.print("Please Enter Brief:");
		String brief=scanner.next();
		
		company.setCid(cid);
		company.setBOD(bod);
		company.setBrief_writeup(brief);
		company.setCEO(ceo);
		company.setCompany_Name(cname);
		company.setSector(sector);
		company.setTurnover(turnover);
		company.setLExchanges(exchange);
		
		
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
	
	RestTemplate template=new RestTemplate();
	HttpHeaders headers=new HttpHeaders();
	headers.setContentType(MediaType.APPLICATION_JSON);
	
	HttpEntity<String> requestEntity=new HttpEntity<String>(headers);
	String url="http://localhost:8087/companys/companypersist";
	template.postForObject(url,company,Company.class);
}


}
