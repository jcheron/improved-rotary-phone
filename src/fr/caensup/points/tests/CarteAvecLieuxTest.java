package fr.caensup.points.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.caensup.points.CarteAvecLieux;
import fr.caensup.points.Point;

class CarteAvecLieuxTest {
	private CarteAvecLieux carte;

	@BeforeEach
	void setUp() throws Exception {
		carte = new CarteAvecLieux(0, 50, 100, 0);
	}

	@Test
	void testIsPointIn() {
		assertFalse(carte.isPointIn(new Point(105, 10)));
		assertTrue(carte.isPointIn(new Point(99, 10)));
		assertTrue(carte.isPointIn(new Point(100, 50)));
		assertTrue(carte.isPointIn(new Point(0, 0)));
	}

	@Test
	void testAddNamedPoint() {
		assertEquals(0, carte.getPoints().size());
		carte.addNamedPoint("Le port", 0, 0);
		assertEquals(1, carte.getPoints().size());
		carte.addNamedPoint("Le port", 0, 0);
		assertEquals(1, carte.getPoints().size());
		carte.addNamedPoint("Le port", 10, 10);
		assertEquals(1, carte.getPoints().size());
		assertFalse(carte.addNamedPoint("Le port", 10, 10));
		assertFalse(carte.addNamedPoint("Tour Leroy", 105, 10));
		assertEquals(1, carte.getPoints().size());
		assertTrue(carte.addNamedPoint("Tour Leroy", 98, 10));
		assertEquals(2, carte.getPoints().size());

	}

}
