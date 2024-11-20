package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserServiceImpl;

@SpringBootTest
public class UserServiceImplTest {
	@Autowired
	UserServiceImpl usi;
	
	//@Test
	public void UserTes() {
		System.out.println("success");
	}
	
	@Test
	public void updateUserTest() {
		usi.updateUser(3, "碇源堂", "第三新東京市");
		System.out.println("success");
	}

}
