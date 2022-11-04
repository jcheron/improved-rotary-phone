package fr.caensup.points;

import java.util.HashMap;
import java.util.Map;

public class Carte {
	private Point topLeft;
	private Point bottomRight;

	private Map<String, Point> points;

	public Carte(Point topLeft, Point bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
		this.points = new HashMap<>();
	}

	public Carte(int x1, int y1, int x2, int y2) {
		this(new Point(x1, y1), new Point(x2, y2));
	}

	public boolean addNamedPoint(String name, int x, int y) {
		if (!points.containsKey(name)) {
			points.put(name, new Point(x, y));
			return true;
		}
		return false;
	}
}
