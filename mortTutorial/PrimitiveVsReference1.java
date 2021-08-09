public class PrimitiveVsReference1 {

    public static void main (String[] args){
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

    }
}
// will return 1, because of different memory location, which means:
// on line 7 & line 8 : x=1 y=1
// however on line 9: x =2 (changes made)
// line 10: print y after changes made, but the x=2 changs doesnt affect y (different memory location, so x & y are completely INDEPENDANT on each other)
// so y will still = 1
