public class CreatingClasses {
    public static void main(String[] args){
        property land = new property(1_000, "Land", 2.1);
        property estate = new property(250_000, "Estate", 1.5, 3, 4);
        System.out.println(land.toString());
        System.out.println();
        System.out.println(estate.toString());
        System.out.println();
        estate.setAskingPrice(100000);
        System.out.println(estate.toString());


    }
}
/*


 */