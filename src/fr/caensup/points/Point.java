package fr.caensup.points;

public class Point {
	private static int nbPoints = 0;

	private int x;
	private int y;

	// Constructeur
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		nbPoints++;
	}

	// Getter sur x
	public int getX() {
		return x;
	}

	// Setter sur x
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point(" + this.x + "," + this.y + ")";
	}

	public float distance(Point aPoint) {
		return (float) Math.sqrt(Math.pow((x - aPoint.getX()), 2) + Math.pow((y - aPoint.getY()), 2));
	}

	public static int getNbPoints() {
		return nbPoints;
	}
}
