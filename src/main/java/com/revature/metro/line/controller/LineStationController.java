package com.revature.metro.line.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.metro.line.model.LineStation;
import com.revature.metro.line.service.LineStationService;

@RestController
@RequestMapping("/line-stations")
public class LineStationController {
	@Autowired
	private LineStationService lineStationService;
	
	@GetMapping("/{start}/{end}")
	public List<LineStation> plan(@PathVariable int start, @PathVariable int end){
		return lineStationService.plan(start, end);
	}
}
