package com.project.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
