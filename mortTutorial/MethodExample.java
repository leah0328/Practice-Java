public class MethodExample {
    public static void main(String[] args){
        int a = 2;
        int b= 3;
        System.out.println(a*b);

        int c = 4;
        int d= 5;
        System.out.println(c*d);
        System.out.println();

        multiply(2,3);                      // so instead of typing out line 3 - 10 infinitely
        multiply(4,5);                      // create a METHOD will be more convenient & improve readability (line 19-25)
        System.out.println();
        rant();

    }

    public static void multiply(int m1, int m2){
        System.out.println(m1*m2);
    }

    public static void rant(){
            System.out.println("ikr, i hate math too:(");
    }

}