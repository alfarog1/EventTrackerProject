package com.skilldistillery.paintracker.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.paintracker.entities.Pain;

class PainTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Pain pain;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("PainTrackerPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		pain = em.find(Pain.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		pain = null;
	}

	@Test
	void test() {
		assertEquals("back", pain.getPainLocation());
	}

}
