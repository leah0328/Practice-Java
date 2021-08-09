public class CompilerExercise1b {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            x -= 1;
            if (x > 3) {
                System.out.println("big x\n");
            }
        }
        int y = 5;
        while (y > 1) {
            y = y - 1;
            if (y < 3) {
                System.out.println("small y\n");
            }
        }

        int z = 5;
        while (z > 1) {
            z = z - 1;
            if (z < 3) {
                System.out.println("small z\n");

            }
        }
    }
}