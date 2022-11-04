package fr.caensup.points;

public class Programme {

	public static void main(String[] args) {
		System.out.println(Point.getNbPoints() + " points");
		Point p = new Point(0, 0);
		System.out.println(p.distance(new Point(4, 4)));
		p.setX(4);
		System.out.println(p.distance(new Point(4, 4)));
		System.out.println(p.distance(p));
		System.out.println(Point.getNbPoints() + " points");

		Lieu l = new Lieu("Caensup", 0, 0);
		System.out.println(l);

		System.out.println(l.equals(new Lieu("Caensup", 0, 0)));
		System.out.println(l.equals(new Carte(0, 0, 50, 50)));
	}

}
