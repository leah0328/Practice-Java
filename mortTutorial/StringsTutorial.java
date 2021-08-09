public class StringsTutorial {

    public static void main (String[] args) {
        String message = "Hello World";
        System.out.println(message);

        System.out.println(message.endsWith("!"));
        System.out.println(message.startsWith("!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("l"));
        System.out.println(message.replace("!", ":D"));
        System.out.println(message); // in java, strings are immutable
        // so any methods that modify a string will always return a new string object}
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); // will trim off spaces before & after the strings (if any)


    }
}
//will print out 'Hello World'

//will return:
//true
//false
//12
//2
//Hello World:D
//Hello World!
//HELLO WORLD!
//Hello World!