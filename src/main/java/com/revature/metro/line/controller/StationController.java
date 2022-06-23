package com.revature.metro.line.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.metro.line.model.Station;
import com.revature.metro.line.service.StationService;

@RestController
@RequestMapping("/stations")
public class StationController {
	@Autowired
	private StationService stationService;
	
	@GetMapping
	public List<Station> list(){
		return stationService.list();
	}
}
