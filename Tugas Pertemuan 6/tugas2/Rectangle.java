package tugas2;

/**
 *
 * @author Adji Pangestu
 */
public class Rectangle extends Shape {

    private final String name;
    private final double width, length;

    public Rectangle(String name, double width, double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        // Area = w * l
        return width * length;
    }

    @Override
    public String getName() {
        return name;
    }

}
