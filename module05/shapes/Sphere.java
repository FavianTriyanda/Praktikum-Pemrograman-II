package module05.shapes;

public class Sphere extends Shape{
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * 3.14 * (radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}
