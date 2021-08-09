public class Casting {

    public static void main (String [] args){
        // Implicit casting
        // byte > short > int > long > float > double

        // byte     : 128
        // short    : 32,768
        // int      : 2,147,483,648
        // long     : 9,223,372,036,854,775,808
        // float    : 6 to 7 decimal digits
        // double   : 15 decimal digits

        short x = 1;
        int y = x + 2;
        System.out.println(y);
        // will return: 3

        double a = 1.1;
        int b = (int)a + 2; // although a is double, putting (int) made the PC read it as 1 instead of 1.1
        System.out.println(b);
        // will return 3

        double c = 1.1;
        double d = c + 2;
        System.out.println(d);
        // will return 3.1

        String e = "1";
        int f = Integer.parseInt(e) + 2; // convert the string to integer (ie. Double.parseDouble, Float.parseFloat)
        System.out.println(f);
        // will return 3


    }
}


