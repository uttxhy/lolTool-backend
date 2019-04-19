package com.example.demo.domain;

import lombok.Data;

@Data
public class Summoner {
	private String summonerId;
	private String name;
	private int level;
	
	public Summoner(String summonerName) {
		this.name = summonerName;
	}
	
}


/*
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
 */
