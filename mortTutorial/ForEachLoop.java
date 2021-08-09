public class ForEachLoop {
    public static void main(String[]args){
       String[] fruits ={"apple","orange","mango"};
        for (int i=0; i<fruits.length; i++)
        System.out.println(fruits[i]);

        // will print out:
        // apple
        // orange
        // mango

        for (String fruit: fruits)  //for fruit(the items), in fruits(the arrays)
            System.out.println(fruit);
        // this method has 1 limitation : cannot iterate the arrays backwards


        String[] bush ={"appeal","orange","manga"};
        for (int i=bush.length; i>0; i--)
            System.out.println(bush[i]); //cannot run, should have printed the items backwards
    }
}
