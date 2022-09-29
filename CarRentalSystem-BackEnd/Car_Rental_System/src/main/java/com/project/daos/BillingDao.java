package com.project.daos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.entities.Billing;

public interface BillingDao extends JpaRepository<Billing, Integer> {
}
