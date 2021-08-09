
public class TernaryOperator {
    public static void main(String[]args){

        int income = 120_000;

        String className = (income>100_000)?"First Class":"Economy";
        System.out.println(className);
        // (condition) ? x : y
        // () for readability
        // if condition = TRUE, return x,
        // if condition = FALSE, return y

    }
}





