public class Shuffle {
    public static void main(String[] args) {
        System.out.println("java Shuffle");
        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.print("d");
                x = x - 1;


            }

        }

    }
}
//output = a-b c-d