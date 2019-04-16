package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.DemoTable1Entity;
import com.example.demo.mapper.DemoMapper;

@Service
public class DemoService {
	@Autowired
	DemoMapper mapper;
	
	public List<DemoTable1Entity> getAllDemoTable1Entity() {
		return mapper.selectAllDemoTable1Entity();
	}
}
