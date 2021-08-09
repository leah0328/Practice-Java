import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThinkJavaChap2e2 {
    public static void main(String[]args){
        Date today = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");

        System.out.println(today);

        int x = 1;
        while (x < 3 ) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3 ) {
            System.out.print("Do");
        }

    }
}
