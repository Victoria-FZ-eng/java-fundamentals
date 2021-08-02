package inheritance;

import java.util.ArrayList;

public class Theater extends Store {

    String name;
    ArrayList<String> movies= new ArrayList<String>();

    public Theater(String name){
        this.name=name;
        movies.add("Pirates Of The Caribbean");
        movies.add("She's The Man");
        movies.add("Maleficent");
        movies.add("Harry Potter");

    }

    public ArrayList<String> addMovie(String mv){
        movies.add(mv);
        return movies;
    }

    public ArrayList<String> removeMovie(int mvidx){
        movies.remove(mvidx);
        return movies;
    }

    @Override
    public String toString(){


        return "Theater Name: " + name + " - Movies Available: "+
                movies;
    }

}
