public class ArithemeticExpression {

    public static void main (String[] args){
        int question1 = 10+3;
        System.out.println(question1);

        int question2 = 10-3;
        System.out.println(question2);

        int question3 = 10*3;
        System.out.println(question3);

        double question4 = (double)10/(double)3;
        System.out.println(question4);
        // 'double' to show decimal, otherwise will only show integer (whole number)
        //ie.
        int question4a = 10/3;
        System.out.println(question4a);

        int question5 = 10%3;
        System.out.println(question5);

        int x = 1;
        x++; //  can be typed as '++x' (PREfix) or 'x++' (POSTfix), same result in this case
        System.out.println(x);


        //   '++x' & 'x++' will have different result if we put it on the right side (after = )
        int y = 1;
        int z = y++; //  value of v will first be copied to z, then y +1, so y=2, z=1
        System.out.println(y);
        System.out.println(z);

        int a = 1;
        int b = ++a; //  value of a will first + 1, then be copied to b, so a=2, b=2
        System.out.println(a);
        System.out.println(b);

        int c =2;
        c += 2; // c will increment by 2, (-= , *=, /= ) can all be used as well
        System.out.println(c);
    }

}
