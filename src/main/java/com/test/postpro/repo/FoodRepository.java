package com.test.postpro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.postpro.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, String>{

}
