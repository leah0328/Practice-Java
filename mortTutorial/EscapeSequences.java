public class EscapeSequences {

    public static void main (String[] args) {
        String message = "Hello \"World\""; // use backslash'\' to print out "
        System.out.println(message);

        String location = "c:\\Windows\\Folder\\ABC..."; // use 2 \ for the computer to recognise and print out \
        System.out.println(location);

        String poet = "Roses are red \nVoilets are blue"; // \n means next line
        System.out.println(poet);

        String poet2 = "Roses are red \tVoilets are blue"; // \t means tab will be inserted
        System.out.println(poet2);
    }
    }

// will print out:
//Hello "World"

//c:\Windows\Folder\ABC...

//Roses are red
//Voilets are blue

//Roses are red 	Voilets are blue
