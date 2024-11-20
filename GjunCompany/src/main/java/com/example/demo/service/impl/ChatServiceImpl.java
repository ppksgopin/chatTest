package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ChatDao;
import com.example.demo.model.Chat;
import com.example.demo.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService{
	@Autowired
	ChatDao cd;

	@Override
	public void addChat(Chat c) {
		cd.save(c);
		
	}

	@Override
	public List<Chat> allChat() {
		// TODO Auto-generated method stub
		return cd.queryAll();
	}

	@Override
	public void updateChat(int id, String content) {
		Chat c=cd.findById(id);
		c.setContent(content);
		
		cd.save(c);
		
	}

	@Override
	public void deleteChat(int id) {
		cd.deleteById(id);
		
	}

}
