package tugas2;


/**
 *
 * @author Adji Pangestu
 */
public class Circle extends Shape {

    private String name;
    private final double radius;
    final double pi = Math.PI;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // Area = π*r^2
        return pi * Math.pow(radius, 2);
    }

    @Override
    public String getName() {
        return name;
    }
}
