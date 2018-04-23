package com.mongo.springboot.data;

import java.util.ArrayList;
import java.util.List;

public class UserLists {

	private List<Fruits> fruit = new ArrayList<Fruits>();
	 
	 
    public List<Fruits> getFruit() {
        return fruit;
    }
 
    public void setFruit(List<Fruits> fruit) {
        this.fruit = fruit;
    }
 
 
    @Override
    public String toString() {
        return "CarFleet [cars=" + fruit + "]";
    }
}
