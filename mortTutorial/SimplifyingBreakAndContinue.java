import java.util.Scanner;

public class SimplifyingBreakAndContinue {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

    }
}
// if there's a while (true), make sure to have a 'break' statement