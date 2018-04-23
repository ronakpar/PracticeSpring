package com.mongo.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.springboot.data.Fruits;
import com.mongo.springboot.srv.FruitsService;

@RestController
@RequestMapping("/hackathon")
public class FruitsController {
	
    @Autowired
    private FruitsService fruiitService;
    
    
  
   
    @RequestMapping(value = "/loadFruits", method = RequestMethod.POST)
  
    public String loadFruits(@RequestBody List<Fruits> jsonString) {
    	
    	//ObjectMapper mapper = new ObjectMapper(); 
		
		
		
	        try {
	        	
	        	//List<Fruits> users = mapper.readValue(new File("src/main/resources/sample.json"), new TypeReference<List<Fruits>>(){});
	        		        
	        	//fruiitService.saveFruits(jsonString);
	        	
	        	System.out.println("JSON String ****"+jsonString.size());
	        	
	        } catch (Exception e) {
	            e.printStackTrace();
	        }   
	         	
	       
        return "SUCCESS JSON"+jsonString.get(0);
    }
    
  
    @RequestMapping(value = "/getUsersByFavoriteFruit/{favoriteFruit}", method = RequestMethod.GET)
    public List<Fruits> findUsersByFavoriteFruit(@PathVariable("favoriteFruit") String fruits) {
    	
    	System.out.println(fruits);
        return fruiitService.findUsersByFavoriteFruit(fruits);
    }
   
}