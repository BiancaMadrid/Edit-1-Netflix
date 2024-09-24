public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String firstName ="Bianca";
        int age = 23;

        System.out.println("Hello user!");
        String username = "Bugambilia";
        String password = "thisisreallyhard123";
        String phoneNumber = "480-658-7199";
        String personalEmail = "bugamadrid111@gmail.com";;

        String movieTitle = "Get Out";
        int releaseYear = 2023;
        float movieRating = 10.00f;
        boolean movieFavorite = true;
        double movieReviews = 9999999999999d;
        String directorsName =  "Jordan Peel";


        /*to add new line to code as /n in the code and rewrite it
         Example: Systems.out.println("Hello/n");
         would run as:
         Hello
         world
         */

        System.out.println("Hello user!" + " " + username );
        System.out.println("Password" + " " + password);
        System.out.println( "Select" + " " + movieTitle);
        System.out.println( "Release year" + " " + releaseYear);
        System.out.println( "Movie Rating" + " " + movieRating);
        System.out.println("Is this your favorite Movie?" + " " + movieFavorite);
        System.out.println("Number of Reviews" + " " + movieReviews);
        System.out.println("Directors Name" + " " + directorsName);




    }
}