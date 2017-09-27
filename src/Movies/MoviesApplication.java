package Movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();


            //This gives the prompt for command instructions
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");
        System.out.println("Enter a number:");
        int userInput = input.getInt();

        if(userInput ==0){
            System.out.println("ok bye!!!!");
        }else if (userInput == 1){
            Movie[] allMovies = MoviesArray.findAll();
            for(Movie movie : allMovies){
                System.out.println(movie.getMovieName());
            }
        }else if(userInput == 2){
            Movie[] allMovies = MoviesArray.findAll();
            for(Movie movie : allMovies){
                if(movie.getMovieCat().equals("animated")){
                    System.out.println(movie.getMovieName());
                }

            }
        }else if (userInput == 3){
            Movie[] allMovies = MoviesArray.findAll();
            for(Movie movie : allMovies){
                if(movie.getMovieCat().equals("drama")){
                    System.out.println(movie.getMovieName());
                }
            }
        }else if (userInput == 4){
            Movie[] allMovies = MoviesArray.findAll();
            for(Movie movie : allMovies){
                if(movie.getMovieCat().equals("horror")){
                    System.out.println(movie.getMovieName());
                }
            }
        }else if (userInput == 5){
            Movie[] allMovies = MoviesArray.findAll();
            for(Movie movie : allMovies){
                if(movie.getMovieCat().equals("scifi")){
                    System.out.println(movie.getMovieName());
                }
            }
            //added an else if for the musical category
        }else if (userInput == 6){
            Movie[] allMovies = MoviesArray.findAll();
            for(Movie movie : allMovies){
                if(movie.getMovieCat().equals("musical")){
                    System.out.println(movie.getMovieName());
                }
            }
        }
    }

}
