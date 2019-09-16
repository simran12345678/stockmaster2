package com.cts.stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cts.stock.entity.Company;


@SpringBootApplication
@EnableAutoConfiguration
public class GetCompany {
	
	public static void main(String[] args) {

	SpringApplication.run(GetCompany.class,args);
	HttpHeaders headers=new HttpHeaders();
	headers.setContentType(MediaType.APPLICATION_JSON);
	
	HttpEntity<String> requestEntity=new HttpEntity<String>(headers);
	
	RestTemplate template=new RestTemplate();
	String url="http://localhost:8087/admins/allcompany";
	ResponseEntity<Company[]> response=template.exchange(url, HttpMethod.GET, requestEntity, Company[].class);
    Company[] companys=response.getBody();
    for(Company company:companys){
    	System.out.println(company);
    	
    }
	}
	
}
