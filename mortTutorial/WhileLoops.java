import java.util.Scanner;

public class WhileLoops {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in); //dont forget the (System.in), also**
        String input = "";
        while (!input.equals("quit")){            //cannot write input != "quit", since String is a reference type
          System.out.print("Input: ");
          input = scanner.next().toLowerCase(); // in case user input CAPITAL LETTERS
            System.out.println("Yea I like this \""+input+"\" too.");
          }


    }
}

//**don't forget this {}, otherwise the "input" will be printed indefinitely lol
