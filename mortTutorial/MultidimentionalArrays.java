import java.util.Arrays;

public class MultidimentionalArrays {


    public static void main (String[] args){
        int [][] numbers = new int [2][3]; // [2 row][3 column]
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers)); // use Arrays.deepToString for multidimentional arrays, instead of Arrays.ToString

        int [][] numbers2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbers2));

    }
}

//will return:
//[[1, 0, 0], [0, 0, 0]]
//[[1, 2, 3], [4, 5, 6]]
