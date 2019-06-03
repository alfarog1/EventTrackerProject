package com.skilldistillery.paintracker.services;

import java.util.List;

import com.skilldistillery.paintracker.entities.Pain;

public interface PainService {

	List<Pain> allPains();

	List<Pain> allPainWithinAnIntensityRange(int low, int high);

	Pain create(Pain pain);

	Pain findById(int id);

	Boolean deleteById(Integer id);

	Pain updatePain(Integer id, Pain pain);

}
