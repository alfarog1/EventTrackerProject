package com.skilldistillery.paintracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.paintracker.entities.Pain;
import com.skilldistillery.paintracker.repositories.PainRepository;
@Service
public class PainServiceImpl implements PainService {

	@Autowired
	private PainRepository repo;
	
	@Override
	public List<Pain> allPains() {
		return repo.findAll();
	}
	
	@Override
	public List<Pain> allPainWithinAnIntensityRange(int low, int high) {
		List<Pain> pains = repo.findByIntensityBetween(low, high);
		return pains;
	}

	@Override
	public Pain create(Pain pain) {
		return repo.saveAndFlush(pain);
	}

	@Override
	public Pain findById(int id) {
		try {
			return repo.findById(id).get();
		} catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public List<Pain> findByPainTrigger( String keyword) {
		return repo.findByPainTrigger(keyword);
	}
	
	@Override
	public Boolean deleteById(Integer id) {
		Boolean deleted = true;
		Optional<Pain> toDelete = repo.findById(id);
		repo.deleteById(id);
		deleted = repo.existsById(toDelete.get().getId());
		return deleted;
	}

	@Override
	public Pain updatePain(Integer id, Pain pain) {
		pain.setId(id);
		repo.saveAndFlush(pain);
		return pain;
	}

//	
}
