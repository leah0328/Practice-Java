import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorProjectSolution {

    public static void main(String[] args){
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Principal: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT/ MONTHS_IN_YEARS;

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        int numbersOfPayments = years * MONTHS_IN_YEARS;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numbersOfPayments))
                / (Math.pow(1 + monthlyInterest, numbersOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);





    }
}
