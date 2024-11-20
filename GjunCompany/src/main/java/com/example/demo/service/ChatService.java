package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Chat;

public interface ChatService {
	//create
	void addChat(Chat c);
	
	//read
	List<Chat> allChat();
	
	
	//update
	void updateChat(int id,String content);
	
	
	//delete
	void deleteChat(int id);

}
