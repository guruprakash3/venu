package com.pack.dao;

import java.util.List;

import com.pack.bean.Pet;
import com.pack.bean.User;
import com.pack.bean.logIn;


public interface UserDao {
	public void saveUser(User emp);
	public boolean fetchUser(logIn l);
	
	public void savePet(Pet pd);
	public List<Pet> viewPet();

}
