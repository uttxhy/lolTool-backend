package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.Summoner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * consultController
 */

 @RestController
 @RequestMapping("/consult")
public class consultController {

    @GetMapping("/getSummoner")
	public String getSummoner(@RequestParam String summonerName) {
        Summoner summoner = new Summoner(summonerName);
		summoner.setName("zcj");
		summoner.setLevel(101);
		return JSON.toJSONString(summoner);
	}
    
}