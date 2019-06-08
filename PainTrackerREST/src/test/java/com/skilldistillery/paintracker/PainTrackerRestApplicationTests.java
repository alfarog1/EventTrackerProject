package com.skilldistillery.paintracker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.skilldistillery.paintracker.repositories.PainRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PainTrackerRestApplicationTests {

	@Autowired
	PainRepository repo;
	
	@Test
	public void contextLoads() {
		assertEquals( "back", repo.findById(1).get().getPainLocation().toString());
		
	}

}


