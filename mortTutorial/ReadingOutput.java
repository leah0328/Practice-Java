
import java.util.Scanner;

public class ReadingOutput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); // use '.nextLine' instead of 'next' to catch user's input even if there's a space in the input
        System.out.print("Age: "); // type 'print' instead of 'println' to be able to insert the input in the same line
        byte age = scanner.nextByte();
        System.out.println("You are " + name + " and are " + age + " years old.");


    }
}

// line 8: /trim() for cases when user accidentally insert unwanted spaces before and after