package com.project.daos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.entities.Booking;
import com.project.entities.User;

public interface BookingDao extends JpaRepository<Booking, Integer>{
    @Query("FROM Booking ORDER BY status DESC")
	List<Booking> findByUser(User id);

}
