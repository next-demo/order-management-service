package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.models.Role;



public interface RoleRepo extends JpaRepository<Role, Integer> {

}
