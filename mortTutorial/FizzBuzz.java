import java.util.Scanner;

public class FizzBuzz {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();


        if (num %5 ==0 && num %3 ==0){
            System.out.println("Fizz Buzz");
        } else if (num %3 == 0){
            System.out.println("Buzz");
        } else if (num %5 == 0){
            System.out.println("Fizz");
        } else {
            System.out.println(num);
        }

    }
}

