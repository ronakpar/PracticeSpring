package com.mongo.springboot.data;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document()

public class Fruits implements Serializable{
    /**
	 * 
    "_id": "5acd0991dcd0ac09737f8836",
    "name": "Gail Hayes",
    "gender": "female",
    "company": "PARAGONIA",
    "email": "gailhayes@paragonia.com",
    "phone": "+1 (983) 446-2310",
    "favoriteFruit": "apple"
	 */
	private static final long serialVersionUID = 3242989754544890629L;
	
	private String _id;
    private String name;
    private String gender;
    
    private String company;
    private String email;
    private String phone;
    private String favoriteFruit;
    
	   public Fruits() {
		   
	   }
   
   


		public String get_id() {
			return _id;
		}
		
		
		
		
		public void set_id(String _id) {
			this._id = _id;
		}




public String getFavoriteFruit() {
	return favoriteFruit;
}


public void setFavoriteFruit(String favoriteFruit) {
	this.favoriteFruit = favoriteFruit;
}


	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFavfavoriteFruit() {
		return favoriteFruit;
	}

	public void setFavfavoriteFruit(String favfavoriteFruit) {
		this.favoriteFruit = favfavoriteFruit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}