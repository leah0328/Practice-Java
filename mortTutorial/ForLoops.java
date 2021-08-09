public class ForLoops {
    public static void main(String[] args){
        for (int i=0; i<5; i++)
            System.out.println("Good Morning" + i);
        for (int j=10; j>=5; j--)
            System.out.println("Good Night" + j);
    }
}
//Will return:
//   Good Morning0
//   Good Morning1
//   Good Morning2
//   Good Morning3
//   Good Morning4

//   Good Night10
//   Good Night9
//   Good Night8
//   Good Night7
//   Good Night6
//   Good Night5
