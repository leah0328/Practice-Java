import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorExtended {
    public static void main(String[] args) {
        final int MONTHS_OF_YEARS=12;
        final int PERCENT=100;

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        float interest =0;
        float period = 0;

        while (true) {
            System.out.print("Principal ($1K - $1M): $");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000) {   // pay attention to how to spacing works
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equals to 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            interest = scanner.nextFloat();
            if (interest >0 && interest <= 30) {
                interest = ( interest / MONTHS_OF_YEARS) / PERCENT;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equals to 30");
        }

        while(true) {
            System.out.print("Period (years): ");
            period = scanner.nextFloat();
            if (period >0 && period <= 30) {
                period = (period * MONTHS_OF_YEARS);
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal * (interest * (Math.pow(1 + interest, period))) / ((Math.pow(1 + interest, period)) - 1);
            String result = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.print(("Mortgage: " + (result)));

    }
}