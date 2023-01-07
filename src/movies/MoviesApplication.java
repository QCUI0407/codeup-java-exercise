package movies;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MoviesApplication {

   public static Movies movies[] = MoviesArray.findAll();

    public static void main(String[] args) {

        show();
    }

    private static void show() {
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add movie\n" +
                    "\n" +
                    "Enter your choice: "
            );
            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();

            switch (command) {
                case 0:
                    System.out.println("Exit");
                    return;
                case 1:
                    showAll();
                    break;
                case 2:
                    //animated
                    showAnimated();
                    //getMovieByName(command);
                    break;
                case 3:
                    //drama
                    showDrama();
                    break;
                case 4:
                    //horror
                    showHorror();
                    break;
                case 5:
                    //scifi
                    showScifi();
                    break;
                case 6:
                    addMovie();
                    break;
                default:
                    System.out.println("Command Error");
            }
        }
    }


    //scifi
    private static void showScifi() {

        String name = "";
        String category = "";
        for (int i = 0; i < movies.length; i++) {
            name = movies[i].getName();
            category = movies[i].getCategory();
            if (category.equalsIgnoreCase("scifi")) {
                System.out.println(name + "---" + category);
            }
        }

    }

    //horror
    private static void showHorror() {

        String name = "";
        String category = "";
        for (int i = 0; i < movies.length; i++) {
            name = movies[i].getName();
            category = movies[i].getCategory();
            if (category.equalsIgnoreCase("horror")) {
                System.out.println(name + "---" + category);
            }
        }
    }

    //drama
    private static void showDrama() {
        String name = "";
        String category = "";
        for (int i = 0; i < movies.length; i++) {
            name = movies[i].getName();
            category = movies[i].getCategory();
            if (category.equalsIgnoreCase("drama")) {
                System.out.println(name + "---" + category);
            }
        }
    }

    //animated
    private static void showAnimated() {
        String name = "";
        String category = "";
        for (int i = 0; i < movies.length; i++) {
            name = movies[i].getName();
            category = movies[i].getCategory();
            if (category.equalsIgnoreCase("animated")) {
                System.out.println(name + "---" + category);
            }
        }
    }

    //show all movies
    private static void showAll() {

        String name = "";
        String category = "";
        for (int i = 0; i < movies.length; i++) {
            name = movies[i].getName();
            category = movies[i].getCategory();
            System.out.println(name + "---" + category);
        }
    }

    //add
    private static void addMovie() {
        System.out.println("================add Movie====================");

        // ALL_MOVIES
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name: ");
        String name = sc.nextLine();
        System.out.println("Please enter category:");
        String category = sc.nextLine();

        Movies newMovie = new Movies(name, category);
        movies = add(movies, newMovie);
        System.out.println(movies[movies.length - 1]);
        System.out.println("You have successfully added:<" + name + ">");
    }

    private static Movies[] add(Movies[] movies, Movies movie) {
        movies = Arrays.copyOf(movies, movies.length + 1);
        movies[movies.length - 1] = movie;
        return movies;
    }

}
