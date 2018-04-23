package com.mongo.springboot.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitsRepository extends MongoRepository<Fruits,String>{
	
	@Query("{favoriteFruit : ?0}") 
	public List<Fruits> findUsersByFavoriteFruit(String favoriteFruit);
	
}