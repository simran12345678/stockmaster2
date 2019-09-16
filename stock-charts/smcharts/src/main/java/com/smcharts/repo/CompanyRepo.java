package com.smcharts.repo;

import org.springframework.data.repository.CrudRepository;

import com.smcharts.model.Company;

public interface CompanyRepo extends CrudRepository<Company, Long>{

}
