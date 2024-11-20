package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao ud;
	
	
	
	@Override
	public void addUser(User u) {
		ud.save(u);
		
	}

	@Override
	public List<User> allUser() {
		// TODO Auto-generated method stub
		return ud.findAll();
	}

	@Override
	public void updateUser(int id, String name, String address) {
		
		User u=ud.findById(id);
		u.setName(name);
		u.setAddress(address);
		
		ud.save(u);
	}

	@Override
	public void deleteUser(int id) {
		ud.deleteById(id);
		
	}

}
