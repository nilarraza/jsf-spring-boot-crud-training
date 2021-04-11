package com.inovaitsys.fruitsurveyapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inovaitsys.fruitsurveyapp.model.FruitServey;
import com.inovaitsys.fruitsurveyapp.repository.FruitServeyRepository;


@Service
public class FruitServeyService {
	
//	@Autowired
//	FruitServeyRepository fruitServeyRepository;

	
//	public String saveFruitServey(FruitServey fruitSurvey) {
//		fruitServeyRepository.save(fruitSurvey);
//		return "success.jsf";
//		
//	}
	
	public String getMessage() {
		
		return "jsg Spring";
			}
	
	
	


}
