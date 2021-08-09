public class MathClass {

    public static void main (String [] args){

        int result = Math.round(1.1F); // Math.round: cast a float to int ; double to long
        System.out.println(result);
        // will return 1 (an integer)

        int result2 = (int)Math.ceil(1.1F); // Math.round: cast a float to int ; double to long
        System.out.println(result2);
        // will return 2 (an integer & ceiling of 1.1-highest)

        int result3 = (int)Math.floor(1.1F);
        System.out.println(result3);
        // will return 1 (an integer & floor of 1.1 - smallest)


        // Math.max(x,y) - return the greater integer
        // Math.min(x,y) - return the smaller integer
        // Math.random(x,y)- return a random number between x & y, if (), wil return ran.num between 0 to 1


        double result4 = Math.round(Math.random() *100);
        System.out.println(result4);
        // will return random num (ie. 98.0)

        //To make it as an integer,
        int result5 = (int)Math.round(Math.random() *100); // round up as a whole number
        System.out.println(result5);

        //or
        int result6 = (int)(Math.random() *100); // make it as an integer
        System.out.println(result6);
        // will return random num (ie. 98)

        int result7 = (int)Math.random() *100;
        System.out.println(result7);
        // will only return 0, because we lose the fraction (by changing it to integer), & 0 x 100 = 0




    }

}


