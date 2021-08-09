import java.awt.*;

public class PrimitiveVsReference2 {

    public static void main (String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x=2;
        System.out.println(point2);
    }
}
// will return point2 ( x=2, y=1)
// point 1 & 2 are dependent of each other, because of same memory allocation
// unlike PRIMITIVE type (which stores exact values of an object),
// REFERENCE type stores A REFERENCE to an object somewhere in the memory
