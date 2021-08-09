import java.text.NumberFormat;

public class FormattingNumbers {

    public static void main (String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123456789.12);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.2);
        System.out.println(result2);

    // less tedious way to write
        String result3 = NumberFormat.getPercentInstance().format(0.3); // method-chaining
        System.out.println(result3);
    // doesn't really need the percent
    }

}
