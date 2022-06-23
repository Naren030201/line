package com.revature.metro.line.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.revature.metro.line.model.LineStation;

@Repository
public class LineStationDao {
	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public List<LineStation> getStations(int lineId) {
		String sql = "from LineStation ls where ls.line.id = :id order by ls.sequence";
		return entityManager.createQuery(sql, LineStation.class)
				.setParameter("id", lineId)
				.getResultList();
	}
}
