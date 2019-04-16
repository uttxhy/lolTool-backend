package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.*;
import com.example.demo.service.DemoService;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RestController
@CrossOrigin(origins = "*")
public class MainController {
	
	@Autowired
	DemoService demoService;
	
	@RequestMapping("/getDemo")
	public List<DemoTable1Entity> getAllDemoTable1Entity() {
		return demoService.getAllDemoTable1Entity();
	}
	
	@GetMapping("/getSummoner")
	public String getSummoner(@RequestParam String summonerId) {
		Summoner summoner = new Summoner(summonerId);
		summoner.setName("zcj");
		summoner.setLevel(105);
		
		return JSON.toJSONString(summoner);
	}
	@RequestMapping("/getProp")
	public String getProp() {
		NeoProperties np = new NeoProperties();
		np.setTitle("title");
		return np.getTitle();
	}
}
