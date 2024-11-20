package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserServiceImpl;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired 
	UserServiceImpl usi;
	
	
	@GetMapping("allUser")
	public List<User> allUser()
	{
		return usi.allUser();
	}
	
	@PostMapping("addUser")
	public String add(@RequestBody User u)
	{
		usi.addUser(u);
		
		return "新增成功";
	}
	
	@PutMapping("update/{id}/{name}/{address}")
	public String updateUser(
			@PathVariable("id")int id,
			@PathVariable("name")String name,
			@PathVariable("address")String address)
	{
		usi.updateUser(id, name, address);
		
		return "修改成功";
	}
	
	
	@DeleteMapping("deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id)
	{
		usi.deleteUser(id);
		
		return "刪除成功";
	}

}
