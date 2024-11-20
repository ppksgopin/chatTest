package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Chat;
import com.example.demo.service.impl.ChatServiceImpl;

@SpringBootTest
public class ChatServiceTest {
	@Autowired
	ChatServiceImpl csi;
	
	@Test
	public void ChatTest()
	{
		csi.addChat(new Chat("葛城美里","屋島作戰計畫","前線作戰指揮官"));
		//System.out.println(csi.allChat());
		//csi.updateChat(4, "tttt");
		//csi.deleteChat(1);
		/*for(Chat c:csi.allChat())
		{
			System.out.println("id:"+c.getId()+"\tcontent:"+c.getContent());
		}*/
		System.out.println("success");
	}

}
