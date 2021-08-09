public class BottlesSongFirstTry {
    public static void main(String[] args) {
        int beer = 3;
        String word = "bottles";

        while (beer > 0) {
            System.out.println(beer + " " + word + " of beer on the wall,");
            System.out.println(beer + " " + word + " of beer!");
            System.out.println("Take one down,");
            System.out.println("Pass it around,");
            beer = beer - 1;

            if (beer == 1) {
                word = "bottle";
            } else if (beer == 0) {
                System.out.println("No more bottles of beer on the wall!");
                break;
            }
            System.out.println(beer + " " + word + " of beer on the wall!");
            System.out.println();

        }
    }
}