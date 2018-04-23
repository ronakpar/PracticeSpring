package com.mongo.springboot.srv;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;

import com.mongo.springboot.data.Fruits;
public interface FruitsService {
	
	 public void saveFruits(List<Fruits> list);

	@Query("{favoriteFruit : ?0}") 
	public List<Fruits> findUsersByFavoriteFruit(String favoriteFruit);
    
}