package fr.caensup.points;

public class Lieu extends Point {

	private String name;

	public Lieu(String name, int x, int y) {
		super(x, y);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + " " + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Lieu)) {
			return false;
		}
		return (this.name + "").equals(((Lieu) obj).getName());

	}

}
