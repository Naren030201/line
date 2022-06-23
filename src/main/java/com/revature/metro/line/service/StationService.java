package com.revature.metro.line.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.metro.line.model.Station;
import com.revature.metro.line.repository.StationRepository;
@Service
public class StationService {
	@Autowired
	private StationRepository stationRepository;
	public List<Station> list(){
		return stationRepository.findByNameContaining("chenn");
	}
}
