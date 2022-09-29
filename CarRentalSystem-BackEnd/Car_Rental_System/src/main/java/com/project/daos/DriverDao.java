package com.project.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Driver;

public interface DriverDao extends JpaRepository<Driver, Integer> {
	
}
