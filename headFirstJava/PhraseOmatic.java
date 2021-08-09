import java.util.Random;

public class PhraseOmatic {
    public static void main (String[] args){

        String[] wordListOne = {
                "24/7","multiTier","30,000 foot","B-to-B",
        "win-win","frontend","web-based","pervasive",
        "smart", "six-sigma","critical-path", "dynamic"
        };

        String[] wordListTwo = {
                "empowered", "sticky","value-added", "oriented",
        "centric", "distributed","clustered", "branded","outside-the-box",
        "positioned","networked", "focused", "leveraged", "aligned", "targeted",
        "shared", "cooperative", "accelerated"
        };

        String[] wordListThree = {
                "process", "tipping-point", "solution",
        "architecture", "core competency","strategy", "mindshare", "portal",
        "space", "vision","paradigm", "mission"
        };

        int lengthOne =wordListOne.length;
        int lengthTwo =wordListTwo.length;
        int lengthThree=wordListThree.length;
        System.out.println("The words in each list are: " + lengthOne + ", " + lengthTwo+ ", " + lengthThree);

        Random randNum = new Random();
        int randOne = (int) (Math.random()*lengthOne);
        int randTwo = (int) (Math.random()*lengthTwo);
        int randThree = (int) (Math.random()*lengthThree);
        System.out.println("The random generated from each list are: " + randOne + ", " + randTwo+ ", " + randThree);

        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo]+ " " + wordListThree[randThree];
        System.out.println("What we need is a "+phrase);
    }
}


