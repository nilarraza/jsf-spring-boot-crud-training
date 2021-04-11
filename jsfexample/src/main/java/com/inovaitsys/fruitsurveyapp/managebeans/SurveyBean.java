package com.inovaitsys.fruitsurveyapp.managebeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.inovaitsys.fruitsurveyapp.service.FruitServeyService;


@ManagedBean
@ViewScoped
public class SurveyBean  {
	
	@Autowired
	FruitServeyService fruitServeyService;

//	public FruitServeyService getFruitServeyService() {
//		return fruitServeyService;
//	}

	public void setFruitServeyService(FruitServeyService fruitServeyService) {
		this.fruitServeyService = fruitServeyService;
	}
	
	public String getservicemessage() {
		System.out.println("Welocome");
		return fruitServeyService.getMessage();
	}
	
	//String name="nilar";

	//action methods
	
//	public void savethis() {
//		System.out.println("welcome");
//		//FruitServey fruitServey=new FruitServey(0,this.getName(),this.getAddress(),this.getEmail(),this.getFruitpday(),this.getFavfruit(),this.getLikebroch());
//		//System.out.println(this.getName());
//		//fruitServeyService.saveFruitServey(fruitServey);
//	}

}
