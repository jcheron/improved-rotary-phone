package fr.caensup.points;

import java.util.ArrayList;
import java.util.List;

public class CarteAvecLieux {
	private Point topLeft;
	private Point bottomRight;
	private List<Lieu> points;

	public CarteAvecLieux(Point topLeft, Point bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
		this.points = new ArrayList<>();
	}

	public CarteAvecLieux(int x1, int y1, int x2, int y2) {
		this(new Point(x1, y1), new Point(x2, y2));
	}

	public boolean isPointIn(Point p) {
		return (p.getX() >= this.topLeft.getX() && p.getX() <= this.bottomRight.getX()
				&& p.getY() <= this.topLeft.getY() && p.getY() >= this.bottomRight.getY());
	}

	public boolean addNamedPoint(String name, int x, int y) {
		Lieu l = new Lieu(name, x, y);
		if (points.contains(l) || !isPointIn(l)) {
			return false;
		}
		return points.add(l);
	}

	public List<Lieu> getPoints() {
		return points;
	}
}
