package com.project.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Feedback;

public interface FeedbackDao extends JpaRepository<Feedback, Integer> {

}
