public class SimpleDotCom {
    int[] locationCells;
    int numberOfHits = 0;

    public String checkYourself(String userGuess) {
        // Get the user guess as a String parameter


        // Convert the user guess to an int
        int userGuessInt = Integer.parseInt(userGuess);

        // Loop through locationCells
        for (int x : locationCells) {
            // Compare the user guess to the location cell
            if (userGuessInt == x) {
                // Increment the number of hits
                numberOfHits = numberOfHits + 1;
                // TODO Findout if it was the last location cell

                if (numberOfHits == 3) {
                    return "kill";
                } else {
                    return "hit";
                }
            } else {
                return "miss";
            }
        }
        return "";
    }

    public void setLocationCells(int[] cellLocations ){
        locationCells = cellLocations;
    }



}