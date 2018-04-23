package com.mongo.springboot.srv;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.mongo.springboot.data.Fruits;
import com.mongo.springboot.data.FruitsRepository;
@Service
public  class FruitsServiceImpl implements FruitsService {
	
    @Autowired
    private FruitsRepository movieRepository;
    
    public void saveFruits(List<Fruits> list){
    	
         movieRepository.save(list);
    }
   
  
    @Override 
	@Query("{'favoriteFruit' : ?0}") 
	public List<Fruits> findUsersByFavoriteFruit(@PathVariable("favoriteFruit") String favoriteFruit){
    	
    	return movieRepository.findUsersByFavoriteFruit(favoriteFruit);
    	
    }
    
  
}