package com.example.demo.domain;

import com.alibaba.fastjson.annotation.JSONField;

public class Summoner {
	private String summonerId;
	private String name;
	private int level;
	
	public Summoner(String summonerId) {
		this.summonerId = summonerId;
	}

	public String getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
}
