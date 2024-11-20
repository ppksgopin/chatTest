package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Chat;

public interface ChatDao extends JpaRepository<Chat,Integer>{
	//逆向排序
	@Query(value="select * from chat order by id desc",nativeQuery=true)
	List<Chat> queryAll();	
	
	Chat findById(int id);

}
