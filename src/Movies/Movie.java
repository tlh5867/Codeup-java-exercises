package Movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getMovieName(){
        return name;
    }
    public String getMovieCat(){
        return category;
    }

}
