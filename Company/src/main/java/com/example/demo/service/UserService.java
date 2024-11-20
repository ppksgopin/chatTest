package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	//create
	void addUser(User u);
	
	//read
	List<User> allUser();
	
	//update
	void updateUser(int id, String name, String address);
	
	//delete
	void deleteUser(int id);

}
