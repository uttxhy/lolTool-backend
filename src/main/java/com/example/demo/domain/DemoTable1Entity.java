package com.example.demo.domain;

public class DemoTable1Entity {
	private int demoId;
	private String name;
	
	public DemoTable1Entity() {
		
	}
	
	public int getDemoId() {
		return demoId;
	}
	public void setDemoId(int demoId) {
		this.demoId = demoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "demoId=" + demoId + "," + "name=" + name;
	}
}
