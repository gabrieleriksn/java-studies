package entities;

public class Sphere {
	public double radius;
	public static final double PI = 3.14;
	
	public double volume() {
		return (4 * Math.pow(radius, 3) * PI) / 3;
	}
}
