package com.revature.metro.line.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.metro.line.model.LineStation;
@Repository
public interface LineStationRepository extends JpaRepository<LineStation, Integer> {

}
