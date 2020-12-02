package com.example.ReactiveDemo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ReactiveDemo.Entity.HistoryEntity;

@RestController
@RequestMapping("/history")
public class HistoryController {

	@PostMapping("/putdata")
	public List<HistoryEntity> putall(){
		
		return null;
	}
	
	
	
}
