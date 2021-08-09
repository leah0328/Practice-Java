import java.util.Scanner;

public class MovieList {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Movie Name: ");
        String movieName = scanner.nextLine();

        System.out.println("Rating (out of 10): ");
        double movieRating = scanner.nextDouble();

        System.out.println("Year Released: ");
        int yearReleased = scanner.nextInt();

        System.out.println("Duration (minutes): ");
        int duration = scanner.nextInt();

        Movie movie = new Movie(movieName, movieRating, yearReleased, duration);

        System.out.println(movie.toString());

    }
}
