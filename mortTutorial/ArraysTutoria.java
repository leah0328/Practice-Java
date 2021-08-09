import java.util.Arrays;

public class ArraysTutoria {
    public static void main (String[] args) {
        int[] numbers = new int[5]; // []specified ARRAYS , 5 represent the number of int inside []
        // remember to change the 'number+s', since it's ARRAYS
        // added 'new' as ARRAYS are reference type
        // this is the old, tedious way of initialise ARRAYS
        numbers[0] = 22; // the first number is 22
        numbers[1] = 23;
        numbers[2] = 24;
        numbers[4] = 26;

        System.out.println(Arrays.toString(numbers));


        int[] numbers2 = {35, 74, 66, 103, 89}; // new way to initialise ARRAYS (if you know the items beforehand )
        System.out.println(numbers2.length);
        Arrays.sort(numbers2); // to sort the items in order
        System.out.println(Arrays.toString(numbers2));
        // java ARRAYS are immutable (fixed length), meaning we cannot add/modify/remove additional items to them
        // use COLLECTION instead, if you want ot add/remove items
    }
}
// will return:
//[22, 23, 24, 0, 26]
//* the fourth number will be set to 0 by default (since we didnt specify what value it will be)
// if boolean : false
// if string: empty string
//5
//[35, 66, 74, 89, 103]