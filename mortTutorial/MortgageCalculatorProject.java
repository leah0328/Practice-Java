
import java.util.Scanner;

public class MortgageCalculatorProject {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interest = (scanner.nextFloat()/12)/100;

        System.out.print("Period (years): ");
        float period = (scanner.nextFloat()*12);


        double result = principal * (interest * (Math.pow(1 + interest, period))) / ((Math.pow(1+interest, period))-1);
        System.out.print(("Mortgage: $"+ (result)));








    }
}
