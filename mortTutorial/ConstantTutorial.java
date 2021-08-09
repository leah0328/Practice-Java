public class ConstantTutorial {

        public static void main (String[] args){
            final float PI = 3.14F; //'final' to make it constant, so the value can't be changed
            // 'F' to reinforce it as float, otherwise pc will see it as a decimal
            // also use capital letter to name constant, so "PI", not "pi"
            // if you further type a 'pi=1', it will become error since the value of PI is final, also pi should be PI
        }
}

//will return: Error, since constant can't be changed