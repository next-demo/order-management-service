package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.models.CategoryDetails;

public interface CategoryRepo extends JpaRepository<CategoryDetails, Integer>  {
	
	

}
