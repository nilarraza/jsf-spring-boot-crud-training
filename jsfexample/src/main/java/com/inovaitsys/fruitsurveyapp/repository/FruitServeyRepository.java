package com.inovaitsys.fruitsurveyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inovaitsys.fruitsurveyapp.model.FruitServey;

@Repository
public interface FruitServeyRepository extends JpaRepository<FruitServey, Integer>{

}
