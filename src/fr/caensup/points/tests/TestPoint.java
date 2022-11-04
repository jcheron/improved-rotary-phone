package fr.caensup.points.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.caensup.points.Point;

class TestPoint {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testDistance() {
		Point p1 = new Point(0, 0);
		assertEquals(0, p1.distance(new Point(0, 0)));
		assertEquals(1, p1.distance(new Point(1, 0)));
		assertEquals(1, p1.distance(new Point(0, 1)));
		assertEquals((float) Math.sqrt(2), p1.distance(new Point(1, 1)));
		assertEquals((float) Math.sqrt(8), p1.distance(new Point(2, 2)));
	}

	@Test
	void testGetNbPoints() {
		assertEquals(0, Point.getNbPoints());
		new Point(0, 0);
		assertEquals(1, Point.getNbPoints());
		new Point(1, 0);
		assertEquals(2, Point.getNbPoints());
	}

}
