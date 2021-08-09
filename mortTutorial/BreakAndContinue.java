import java.util.Scanner;

public class BreakAndContinue {

        public static void main (String[] args){

            Scanner scanner = new Scanner (System.in);
            String input = "";
            while (!input.equals("quit")) {
                System.out.println("Input: ");
                input = scanner.next().toLowerCase();
                if (input.equals("quit"))
                    break;
                System.out.println(input);
            }
        }
}

// break the cycle (wouldn't echo 'quit' after user insert 'quit')
//line 12 : if input = "quit"
//line 13 : break the cycle (terminate the loop)
//line 14 : otherwise, echo the input