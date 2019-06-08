package com.skilldistillery.paintracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.paintracker.entities.Pain;

public interface PainRepository extends JpaRepository<Pain, Integer> {
	List<Pain> findByIntensityBetween(int low, int high);
	List<Pain> findByPainTrigger( String keyword);

}
