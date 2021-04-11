package com.inovaitsys.fruitsurveyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inovaitsys.fruitsurveyapp.model.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer>{

}
