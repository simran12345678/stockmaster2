package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import com.smcharts.model.Company;

public interface CompanyService {

	public List<Company> getUsers();

	public Company createUser(Company company);

	public Optional<Company> getUserById(Long id);
	
}
