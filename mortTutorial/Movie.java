public class Movie {
    private String movieName;
    private double movieRating;
    private int yearReleased;
    private int duration;


    //constructor
    public Movie(String movieName, double movieRating, int yearReleased, int duration){
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.yearReleased =yearReleased;
        this.duration=duration;
    }

    //method
    public String toString(){
        return "Movie: " + movieName +
                "\nRating: "+movieRating+
                "\nYear Released: "+ yearReleased +
                "\nDuration: "+duration;
    }

    //mutator method
    public void changeMovieName (String newMovieName){
        movieName=newMovieName;
    }

    public void changeMovieRating(double newMovieRating){
        movieRating=newMovieRating;
    }

    public void changeYearReleased(int newYearReleased){
        yearReleased=newYearReleased;
    }

    public void changeDuration(int newDuration){
        duration=newDuration;
    }

}
