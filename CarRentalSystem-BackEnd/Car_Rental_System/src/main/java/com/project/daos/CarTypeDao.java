package com.project.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.CarType;

public interface CarTypeDao extends JpaRepository<CarType, Integer>{

}
