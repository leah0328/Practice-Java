import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
// do...while = the loop will always be executed at least once,
// even if the condition is false, because the code block is executed before the condition is tested: