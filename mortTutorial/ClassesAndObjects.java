public class ClassesAndObjects {

    public static void main(String[]args ){
        // (2) these are OBJECTS we created & the Attributes we assigned to the objects created after creating CLASS
        Lens lensOne = new Lens("sony","85mm",true);
        Lens lensTwo = new Lens("sony","30mm",true);
        Lens lensThree = new Lens("canon","24-70mm",false);

        // (3) print out the attributes
        System.out.println("Len 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println();

        System.out.println("Len 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println();

        System.out.println("Len 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
        System.out.println();
    }

    // (1) this is the CLASS we FIRST CREATED
    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand,String focalLength, boolean isPrime){
            this.brand = brand;
            this.focalLength= focalLength;
            this.isPrime = isPrime;
        }
    }
}
