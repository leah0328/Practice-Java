public class IfStatement {
    public static void main (String[] args){

        int temp = 22;

        if (temp>30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temp>20 && temp<=30) {
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }
    }
}
