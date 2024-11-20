package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Chat;
import com.example.demo.service.impl.ChatServiceImpl;

@RestController
@RequestMapping("chat")
@CrossOrigin
public class ChatController {
	
	@Autowired
	ChatServiceImpl csi;
	
	
	@GetMapping("AllChat")
	public List<Chat> gtoAllChat()
	{
		return csi.allChat();
	}
	
	@PostMapping("AddChat")
	public String addChat(@RequestBody Chat c)
	{
		csi.addChat(c);
		return "新增成功";
	}
	
	@PutMapping("UpdateChat/{id}/{content}")
	public String updateChat(@PathVariable("id") int id,@PathVariable("content")String content)
	{
		csi.updateChat(id, content);
		return "修改成功";
	}
	
	@DeleteMapping("DeleteChat/{id}")
	public String deleteChat(@PathVariable("id") int id)
	{
		csi.deleteChat(id);
		return "刪除成功";
	}

}
