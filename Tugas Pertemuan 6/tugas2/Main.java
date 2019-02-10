package tugas2;

/**
 *
 * @author Adji Pangestu
 */
public class Main{
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 5;
        Shape r = new Rectangle("Persegi", width, length);
        System.out.println("Name Rectangle  : " + r.getName());
        System.out.println("Rectangle size  : " + "width: " + width + " dan length: " + length);
        System.out.println("Rectangle area  : " + r.getArea());
        
        System.out.println("");
        
        // Circle test
        double radius = 5;
        Shape c = new Circle("Lingkaran", radius);
        System.out.println("Name Circle     : " + c.getName());
        System.out.println("Circle radius   : " + radius);
        System.out.println("Circle Area     : " + c.getArea());

    }
}