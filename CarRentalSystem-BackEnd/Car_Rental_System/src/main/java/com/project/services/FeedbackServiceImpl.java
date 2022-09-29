package com.project.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.daos.FeedbackDao;
import com.project.entities.Feedback;

@Transactional
@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	private FeedbackDao feedbackDao; 
	@Override
	public Feedback saveFeedback(Feedback feedback) {
		
		return feedbackDao.save(feedback);
	}
	@Override
	public List<Feedback> displayAll() {
		
		return feedbackDao.findAll();
	}

}
