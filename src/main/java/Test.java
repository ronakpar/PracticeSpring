import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.tomcat.jni.User;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongo.springboot.data.Fruits;

public class Test {

	
	public static void main(String args[]) throws JsonParseException, JsonMappingException, IOException {
		 
		ObjectMapper mapper = new ObjectMapper(); 
		List<Fruits> users = mapper.readValue(new File("src/main/resources/sample.json"), new TypeReference<List<Fruits>>(){});
		  
	        /**
	         * Read object from file
	         */
	
	/*	List<Fruits> list = mapper.readValue(,
				TypeFactory.defaultInstance().constructCollectionType(List.class,  
						Fruits.class));
		
			UserLists value = null;
	        try {
	            value = mapper.readValue(new File("C:\\Practice\\sample.json"), UserLists.class);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }   */
	         
		
	        System.out.println(users.size());
	
	
		
	}

	
}