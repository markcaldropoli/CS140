package exam01;

public class Vector {
	private double horz;
	private double vert;

	public Vector(double hor, double ver) {
		if(hor < 0 || ver < 0) throw new IllegalArgumentException("Components must be non-negative");
		this.horz = hor;
		this.vert = ver;
	}

	public double getHorz() {
		return horz;
	}

	public double getVert() {
		return vert;
	}

	@Override
	public String toString() {
		return "<"+horz+", "+vert+">";
	}

	public double magnitude() {
		double mag = (horz*horz) + (vert*vert);
		mag = Math.sqrt(mag);
		return mag;
	}
}
